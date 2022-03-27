package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.CategoryDao;
import com.spring.classes.POJO.Air_Tickets;
import com.spring.classes.POJO.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Category> getAllCategory() {
        Session session=sessionFactory.getCurrentSession();
        Query<Category> query=session.createQuery("select '*' from Category",Category.class);
        List<Category> allCategory =query.getResultList();
        return allCategory;
    }

    @Override
    public void saveCategory(Category category) {
        Session session=sessionFactory.getCurrentSession();
        session.save(category);
    }
}
