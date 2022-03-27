package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Order_Table;

import java.util.List;

public interface Order_TableDao {
    public List<Order_Table> getAllOrder_Table();
    public void saveOrder_Table(Order_Table order_Table);
}
