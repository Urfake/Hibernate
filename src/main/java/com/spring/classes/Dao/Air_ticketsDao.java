package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Air_Tickets;

import java.util.List;

public interface Air_ticketsDao {
    public List<Air_Tickets> getAllAir_tickets();
    public void saveAir_tickets(Air_Tickets air_tickets);
}
