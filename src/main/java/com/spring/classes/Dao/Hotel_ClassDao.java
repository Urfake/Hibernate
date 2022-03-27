package com.spring.classes.Dao;

import com.spring.classes.POJO.Hotel_Class;

import java.util.List;

public interface Hotel_ClassDao {
    public List<Hotel_Class> getAllHotel_Class();
    public void saveHotel_Class(Hotel_Class hotel_Class);
}
