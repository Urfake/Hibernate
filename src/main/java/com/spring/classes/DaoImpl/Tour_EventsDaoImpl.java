package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.Tour_EventsDao;
import com.spring.classes.POJO.Hotel_Class;
import com.spring.classes.POJO.Tour_Events;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Tour_EventsDaoImpl implements Tour_EventsDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Tour_Events> getAllTour_Events() {
        Session session=sessionFactory.getCurrentSession();
        Query<Tour_Events> query=session.createQuery("select '*' from Tour_Events",Tour_Events.class);
        List<Tour_Events> allClient =query.getResultList();
        return allClient;
    }

    @Override
    public void saveTour_Events(Tour_Events hotel_Class) {
        Session session=sessionFactory.getCurrentSession();
        session.save(hotel_Class);
    }
}
