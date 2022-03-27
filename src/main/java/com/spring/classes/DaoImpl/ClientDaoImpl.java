package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.ClientDao;
import com.spring.classes.POJO.Category;
import com.spring.classes.POJO.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientDaoImpl implements ClientDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Client> getAllClient() {
        Session session=sessionFactory.getCurrentSession();
        Query<Client> query=session.createQuery("select '*' from Client",Client.class);
        List<Client> allClient =query.getResultList();
        return allClient;
    }

    @Override
    public void saveClient(Client client) {
        Session session=sessionFactory.getCurrentSession();
        session.save(client);
    }
}
