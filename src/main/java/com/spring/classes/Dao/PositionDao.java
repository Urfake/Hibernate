package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Position;

import java.util.List;

public interface PositionDao {
    public List<Position> getAllPosition();
    public void savePosition(Position position);
}
