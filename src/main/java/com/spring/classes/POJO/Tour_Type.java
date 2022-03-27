package com.spring.classes.POJO;
import javax.persistence.*;

@Entity
@Table(name="tourtype")
public class Tour_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDtourType")
    private int IDtourType;

    @Column(name = "tourType")
    private String tourType;

    public Tour_Type(){}

    public Tour_Type(String tourType) {
        this.tourType = tourType;
    }

    @Override
    public String toString() {
        return "TourType{" +
                "IDtourType=" + IDtourType +
                ", tourType='" + tourType + '\'' +
                '}';
    }

    public int getIDtourType() {
        return IDtourType;
    }

    public void setIDtourType(int IDtourType) {
        this.IDtourType = IDtourType;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }
}
