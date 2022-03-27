package com.spring.classes.Dao;

import com.spring.classes.POJO.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}
