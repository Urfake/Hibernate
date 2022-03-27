package com.spring.classes.Dao;

import com.spring.classes.POJO.Air_class;

import java.util.List;

public interface Air_classDao {
    public List<Air_class> getAllAir_class();
    public void saveAir_class(Air_class Air_class);
}
