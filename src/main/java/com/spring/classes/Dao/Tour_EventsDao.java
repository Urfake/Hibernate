package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Tour_Events;

import java.util.List;

public interface Tour_EventsDao {
    public List<Tour_Events> getAllTour_Events();
    public void saveTour_Events(Tour_Events tour_events);
}
