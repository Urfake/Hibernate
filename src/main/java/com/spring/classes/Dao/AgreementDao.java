package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;

import java.util.List;

public interface AgreementDao {
    public List<Agreement> getAllAgreement();
    public void saveAgreement(Agreement agreement);
}
