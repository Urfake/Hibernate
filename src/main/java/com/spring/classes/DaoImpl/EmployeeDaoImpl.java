package com.spring.classes.DaoImpl;

import com.spring.classes.Dao.EmployeeDao;
import com.spring.classes.POJO.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Employee> getAllEmployees() {
        Session session=sessionFactory.getCurrentSession();
        Query<Employee> query=session.createQuery("from Employee",Employee.class);
                List<Employee> allEmployees =query.getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session=sessionFactory.getCurrentSession();
        session.save(employee);
    }
}
