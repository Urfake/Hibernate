package com.spring.classes.POJO;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDhotel")
    private int IDhotel;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ HotelClass
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "hotelClass")
    private Hotel_Class hotelClass;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Tour (Bi)
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "tour_id")
    private Tour tour;

    //СВЯЗЬ ОДИН КО МНОГИМ С ТАБЛИЦЕЙ Rooms (Bi)
    @OneToMany(mappedBy = "hotel",cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Rooms> roomsList;

    @Column(name = "city")
    private String city;

    @Column(name = "name")
    private String name;

    public Hotel() {
    }


    public Hotel(String beginningDate, String city, String country, String endingDate, String name, Integer programNumber, Integer tourNumber, String tourType) {
        this.city = city;
        this.name = name;
    }

    public int getIDhotel() {
        return IDhotel;
    }

    public void setIDhotel(int IDhotel) {
        this.IDhotel = IDhotel;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public List<Rooms> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(List<Rooms> roomsList) {
        this.roomsList = roomsList;
    }

    public Hotel_Class getHotelClass() {
        return hotelClass;
    }

    public void setHotelClass(Hotel_Class hotelClass) {
        this.hotelClass = hotelClass;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
