package com.spring.classes.POJO;
import javax.persistence.*;


@Entity
@Table(name="position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDposition")
    private int IDposition;

    @Column(name="name")
    private String name;

    public Position() {
    }

    public Position(String name) {
        this.name = name;
    }

    public int getIDposition() {
        return IDposition;
    }

    public void setIDposition(int IDposition) {
        this.IDposition = IDposition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Position{" +
                "IDposition=" + IDposition +
                ", name='" + name + '\'' +
                '}';
    }

}
