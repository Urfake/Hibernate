package com.spring.classes.Dao;

import com.spring.classes.POJO.Tour_Tasks;

import java.util.List;

public interface Tour_TaskDao {
    public List<Tour_Tasks> getAllTour_Task();
    public void saveAgreement(Tour_Tasks tour_task);
}
