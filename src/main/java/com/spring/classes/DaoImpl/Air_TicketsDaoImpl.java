package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.Air_ticketsDao;
import com.spring.classes.POJO.Air_Tickets;
import com.spring.classes.POJO.Air_class;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Air_TicketsDaoImpl implements Air_ticketsDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Air_Tickets> getAllAir_tickets() {
        Session session=sessionFactory.getCurrentSession();
        Query<Air_Tickets> query=session.createQuery("select '*' from Air_Tickets",Air_Tickets.class);
        List<Air_Tickets> allAir_Tickets =query.getResultList();
        return allAir_Tickets;
    }

    @Override
    public void saveAir_tickets(Air_Tickets air_Tickets) {
        Session session=sessionFactory.getCurrentSession();
        session.save(air_Tickets);
    }
}
