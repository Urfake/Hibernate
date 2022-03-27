package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Program;

import java.util.List;

public interface ProgramDao {
    public List<Program> getAllProgram();
    public void saveProgram(Program program);
}
