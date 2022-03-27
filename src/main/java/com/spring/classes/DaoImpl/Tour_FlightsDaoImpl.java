package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.Tour_FlightsDao;
import com.spring.classes.POJO.Tour_Events;
import com.spring.classes.POJO.Tour_Flights;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Tour_FlightsDaoImpl implements Tour_FlightsDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Tour_Flights> getAllTour_Flights() {
        Session session=sessionFactory.getCurrentSession();
        Query<Tour_Flights> query=session.createQuery("select '*' from Tour_Flights",Tour_Flights.class);
        List<Tour_Flights> allClient =query.getResultList();
        return allClient;
    }

    @Override
    public void saveTour_Flights(Tour_Flights hotel_Class) {
        Session session=sessionFactory.getCurrentSession();
        session.save(hotel_Class);
    }
}
