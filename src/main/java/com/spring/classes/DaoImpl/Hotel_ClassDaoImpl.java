package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.Hotel_ClassDao;
import com.spring.classes.POJO.Event_Tickets;
import com.spring.classes.POJO.Hotel_Class;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Hotel_ClassDaoImpl implements Hotel_ClassDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Hotel_Class> getAllHotel_Class() {
        Session session=sessionFactory.getCurrentSession();
        Query<Hotel_Class> query=session.createQuery("select '*' from Hotel_Class",Hotel_Class.class);
        List<Hotel_Class> allClient =query.getResultList();
        return allClient;
    }

    @Override
    public void saveHotel_Class(Hotel_Class hotel_Class) {
        Session session=sessionFactory.getCurrentSession();
        session.save(hotel_Class);
    }
}
