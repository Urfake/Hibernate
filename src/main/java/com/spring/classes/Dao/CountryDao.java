package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Country;

import java.util.List;

public interface CountryDao {
    public List<Country> getAllCountry();
    public void saveCountry(Country country);
}
