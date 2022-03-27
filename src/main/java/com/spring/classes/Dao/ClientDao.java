package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Client;

import java.util.List;

public interface ClientDao {
    public List<Client> getAllClient();
    public void saveClient(Client client);
}
