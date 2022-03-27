package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Tour_Flights;

import java.util.List;

public interface Tour_FlightsDao {
    public List<Tour_Flights> getAllTour_Flights();
    public void saveTour_Flights(Tour_Flights tour_flights);
}
