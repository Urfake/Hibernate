package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Event_Tickets;

import java.util.List;

public interface Event_TicketsDao {
    public List<Event_Tickets> getAllEvent_Tickets();
    public void saveEvent_Tickets(Event_Tickets event_Tickets);
}
