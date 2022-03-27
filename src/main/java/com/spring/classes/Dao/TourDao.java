package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Tour;

import java.util.List;

public interface TourDao {
    public List<Tour> getAllTour();
    public void saveTour(Tour tour);
}
