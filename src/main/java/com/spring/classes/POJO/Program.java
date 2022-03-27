package com.spring.classes.POJO;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="program")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDprogram")
    private Integer IDprogram;

    @Column(name="description")
    private String description;

    public Program() {
    }

    public Program(String description) {
        this.description = description;
    }

    public int getIDprogram() {
        return IDprogram;
    }

    public void setIDprogram(int IDprogram) {
        this.IDprogram = IDprogram;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Program{" +
                "IDprogram=" + IDprogram +
                ", description='" + description + '\'' +
                '}';
    }
}
