package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Hotel;

import java.util.List;

public interface HotelDao {
    public List<Hotel> getAllHotel();
    public void saveHotel(Hotel hotel);
}
