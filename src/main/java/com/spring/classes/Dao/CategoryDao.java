package com.spring.classes.Dao;

import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Category;

import java.util.List;

public interface CategoryDao {
    public List<Category> getAllCategory();
    public void saveCategory(Category Category);
}
