package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.HotelDao;
import com.spring.classes.POJO.Hotel;
import com.spring.classes.POJO.Hotel_Class;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HotelDaoImpl implements HotelDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Hotel> getAllHotel() {
        Session session=sessionFactory.getCurrentSession();
        Query<Hotel> query=session.createQuery("select '*' from Hotel",Hotel.class);
        List<Hotel> allClient =query.getResultList();
        return allClient;
    }

    @Override
    public void saveHotel(Hotel hotel) {
        Session session=sessionFactory.getCurrentSession();
        session.save(hotel);
    }
}
