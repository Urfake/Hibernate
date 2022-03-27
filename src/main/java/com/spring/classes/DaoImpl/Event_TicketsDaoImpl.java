package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.Event_TicketsDao;
import com.spring.classes.POJO.Client;
import com.spring.classes.POJO.Event_Tickets;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Event_TicketsDaoImpl implements Event_TicketsDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Event_Tickets> getAllEvent_Tickets() {
        Session session=sessionFactory.getCurrentSession();
        Query<Event_Tickets> query=session.createQuery("select '*' from Event_Tickets",Event_Tickets.class);
        List<Event_Tickets> allClient =query.getResultList();
        return allClient;
    }

    @Override
    public void saveEvent_Tickets(Event_Tickets event_Tickets) {
        Session session=sessionFactory.getCurrentSession();
        session.save(event_Tickets);
    }
}
