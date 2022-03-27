package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.Air_classDao;
import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Air_class;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Air_ClassDaoImpl implements Air_classDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Air_class> getAllAir_class() {
        Session session=sessionFactory.getCurrentSession();
        Query<Air_class> query=session.createQuery("select '*' from Air_class",Air_class.class);
        List<Air_class> allAir_Class =query.getResultList();
        return allAir_Class;
    }

    @Override
    public void saveAir_class(Air_class air_class) {
        Session session=sessionFactory.getCurrentSession();
        session.save(air_class);
    }
}
