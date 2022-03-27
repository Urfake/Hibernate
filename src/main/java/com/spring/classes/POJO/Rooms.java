package com.spring.classes.POJO;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="rooms")
public class Rooms {

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "room_permit",
            joinColumns = @JoinColumn(name = "room_id"),inverseJoinColumns = @JoinColumn(name = "permit_id"))
    private List<Permit> permitList;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDrooms")
    private int IDrooms;

    @Column(name="arrivalDate")
    private String arrivalDate;

    @Column(name = "place")
    private Integer place;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name="departureDate")
    private String departureDate;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Rooms() {
    }

    public Rooms(String arrivalDate, String departureDate) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getIDrooms() {
        return IDrooms;
    }

    public void setIDrooms(int IDrooms) {
        this.IDrooms = IDrooms;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public List<Permit> getPermitList() {
        return permitList;
    }

    public void setPermitList(List<Permit> permitList) {
        this.permitList = permitList;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "IDrooms=" + IDrooms +
                ", place=" + place +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                '}';
    }
}
