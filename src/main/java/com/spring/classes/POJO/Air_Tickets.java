package com.spring.classes.POJO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="air_tickets")
public class Air_Tickets {

    //СВЯЗЬ МНОГИЕ К ОДНОМУ С ТАБЛИЦЕЙ TourFlights
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tourFlight")
    private Tour_Flights tourFlights;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ AirLine
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "class_id")
    private Air_class airclass;

    //СВЯЗЬ МНОГИЕ КО МНОГИМ С ТАБЛИЦЕЙ Permit
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "permit_airTicketTour",
            joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "permit_id"))
    private List<Permit> permitList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDairTickets")
    private Integer idAirTickets;

    @Column(name="airline")
    private String airline;

    @Column(name="fligheCode")
    private Integer flightCode;

    @Column(name="place")
    private Integer place;

    public Air_Tickets() {
    }

    public Air_Tickets(String airline, Integer flightCode, Integer place) {
        this.airline = airline;
        this.flightCode = flightCode;
        this.place = place;
    }

    public Integer getIdAirTickets() {
        return idAirTickets;
    }

    public void setIdAirTickets(Integer idAirTickets) {
        this.idAirTickets = idAirTickets;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Integer getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(Integer flightCode) {
        this.flightCode = flightCode;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Air_class getAirclass() {
        return airclass;
    }

    public void setAirclass(Air_class airclass) {
        this.airclass = airclass;
    }

    public List<Permit> getPermitList() {
        return permitList;
    }

    public void setPermitList(List<Permit> permitList) {
        this.permitList = permitList;
    }

    public Tour_Flights getTourFlights() {
        return tourFlights;
    }

    public void setTourFlights(Tour_Flights tourFlights) {
        this.tourFlights = tourFlights;
    }

    @Override
    public String toString() {
        return "AirTickets{" +
                "idAirTickets=" + idAirTickets +
                ", airline='" + airline + '\'' +
                ", flightCode=" + flightCode +
                ", place=" + place +
                '}';
    }
}
