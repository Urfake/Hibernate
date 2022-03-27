package com.spring.classes.POJO;
import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDcategory")
    private Integer IDcategory;

    @Column(name="category")
    private String category;


    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }

    public Integer getIDcategory() {
        return IDcategory;
    }

    public void setIDcategory(Integer IDcategory) {
        this.IDcategory = IDcategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "category{" +
                "category='" + category + '\'' +
                ", IDcategory=" + IDcategory +
                '}';
    }
}
