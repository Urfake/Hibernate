package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Tourist;

import java.util.List;

public interface TouristDao {
    public List<Agreement> getAllTourist();
    public void saveTourist(Tourist tourist);
}
