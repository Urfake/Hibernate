package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Staff;

import java.util.List;

public interface StaffDao {
    public List<Staff> getAllStaff();
    public void saveStaff(Staff staff);
}
