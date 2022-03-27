package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.Tour_TaskDao;
import com.spring.classes.POJO.Tour_Flights;
import com.spring.classes.POJO.Tour_Tasks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Tour_TaskDaoImpl implements Tour_TaskDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Tour_Tasks> getAllTour_Task() {
        Session session=sessionFactory.getCurrentSession();
        Query<Tour_Tasks> query=session.createQuery("select '*' from Tour_Tasks",Tour_Tasks.class);
        List<Tour_Tasks> allClient =query.getResultList();
        return allClient;
    }

    @Override
    public void saveAgreement(Tour_Tasks tour_tasks) {
        Session session=sessionFactory.getCurrentSession();
        session.save(tour_tasks);
    }
}
