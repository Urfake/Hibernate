package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Rooms;

import java.util.List;

public interface RoomsDao {
    public List<Rooms> getAllRooms();
    public void savev(Rooms rooms);
}
