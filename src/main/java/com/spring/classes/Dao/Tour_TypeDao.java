package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Tour_Type;

import java.util.List;

public interface Tour_TypeDao {
    public List<Tour_Type> getAllTour_Type();
    public void saveTour_Type(Tour_Type tour_type);
}
