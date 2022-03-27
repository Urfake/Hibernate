package com.spring.classes.POJO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tourevents")
public class Tour_Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDtourEvents")
    private int IDtourEvents;

    @Column(name="beginningTime")
    private String beginningTime;

    @Column(name="city")
    private String city;

    @Column(name="name")
    private String name;

    @Column(name="place")
    private String place;

    //СВЯЗЬ МНОГИЕ К ОДНОМУ С ТАБЛИЦЕЙ Tour (Bi)
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private Tour tour;

    //СВЯЗЬ ОДИН КО МНОГИМ С ТАБЛИЦЕЙ EventTickets (Bi)
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "tourEvents")
    private List<Event_Tickets> eventTickets;

    public Tour_Events() {
    }


    public Tour_Events(String beginningTime, String city, String name, String place) {
        this.beginningTime = beginningTime;
        this.city = city;
        this.name = name;
        this.place = place;
    }

    public List<Event_Tickets> getEventTickets() {
        return eventTickets;
    }

    public void setEventTickets(List<Event_Tickets> eventTickets) {
        this.eventTickets = eventTickets;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public int getIDtourEvents() {
        return IDtourEvents;
    }

    public void setIDtourEvents(int IDtourEvents) {
        this.IDtourEvents = IDtourEvents;
    }

    public String getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(String beginningTime) {
        this.beginningTime = beginningTime;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    @Override
    public String toString() {
        return "TourEvents{" +
                "IDtourEvents=" + IDtourEvents +
                ", beginningTime='" + beginningTime + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }


}
