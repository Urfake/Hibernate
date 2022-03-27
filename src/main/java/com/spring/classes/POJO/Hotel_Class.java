package com.spring.classes.POJO;
import javax.persistence.*;

@Entity
@Table(name="hotelclass")
public class Hotel_Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="class")
    private String hotelClass;

    public Hotel_Class() {
    }

    public Hotel_Class(String hotelClass) {
        this.hotelClass = hotelClass;
    }

    public String getHotelClass() {
        return hotelClass;
    }

    public void setHotelClass(String hotelClass) {
        this.hotelClass = hotelClass;
    }

    @Override
    public String toString() {
        return "HotelClass{" +
                "hotelClass='" + hotelClass + '\'' +
                '}';
    }
}
