package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.AgreementDao;
import com.spring.classes.POJO.Agreement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AgreementDaoImpl implements AgreementDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Agreement> getAllAgreement() {
        Session session=sessionFactory.getCurrentSession();
        Query<Agreement> query=session.createQuery("select '*' from Agreement",Agreement.class);
        List<Agreement> allAgreement =query.getResultList();
        return allAgreement;
    }

    @Override
    public void saveAgreement(Agreement agreement) {
        Session session=sessionFactory.getCurrentSession();
        session.save(agreement);
    }
}
