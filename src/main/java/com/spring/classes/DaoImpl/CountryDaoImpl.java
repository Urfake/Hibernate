package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.CountryDao;
import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Client;
import com.spring.classes.POJO.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CountryDaoImpl implements CountryDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Country> getAllCountry() {
        Session session= sessionFactory.getCurrentSession();
        Query<Country> query=session.createQuery("select '*' from Country",Country.class);
        List<Country> allCountry =query.getResultList();
        return allCountry;
    }

    @Override
    public void saveCountry(Country country) {
        Session session= sessionFactory.getCurrentSession();
        session.save(country);
    }
}
