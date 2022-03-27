package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Permit;

import java.util.List;

public interface PermitDao {
    public List<Permit> getAllPermit();
    public void savePermit(Permit permit);
}
