package com.spring.classes.POJO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="permit")
public class Permit {

    //СВЯЗЬ МНОГИМ КО МНОГИМ С ТАБЛИЦЕЙ Rooms
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "room_permit",
            joinColumns = @JoinColumn(name = "permit_id"),inverseJoinColumns = @JoinColumn(name = "room_id"))
    private List<Rooms> roomsList;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Tourist
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tourist_id")
    private Tourist tourist;

    //СВЯЗЬ МНОГИМ КО МНОГИМ С ТАБЛИЦЕЙ EventTickets
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "permit_tourTicket",
            joinColumns = @JoinColumn(name = "permit_id"),
            inverseJoinColumns = @JoinColumn(name = "ticket_id"))
    private List<Event_Tickets> eventTickets;

    //СВЯЗЬ МНОГИМ КО МНОГИМ С ТАБЛИЦЕЙ AirTickets
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "permit_airTicketTour",
            joinColumns = @JoinColumn(name = "permit_id"),
            inverseJoinColumns = @JoinColumn(name = "ticket_id"))
    private List<Air_Tickets> airTickets;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDpermit")
    private int IDpermit;

    @Column(name="agreementDate")
    private String agreementDate;

    @Column(name="tourNumber")
    private int tourNumber;

    public Permit() {
    }

    public Permit(String agreementDate, int tourNumber) {
        this.agreementDate = agreementDate;
        this.tourNumber = tourNumber;
    }

    public int getIDpermit() {
        return IDpermit;
    }

    public void setIDpermit(int IDpermit) {
        this.IDpermit = IDpermit;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public int getTourNumber() {
        return tourNumber;
    }

    public void setTourNumber(int tourNumber) {
        this.tourNumber = tourNumber;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public List<Rooms> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(List<Rooms> roomsList) {
        this.roomsList = roomsList;
    }

    public List<Event_Tickets> getEventTickets() {
        return eventTickets;
    }

    public void setEventTickets(List<Event_Tickets> eventTickets) {
        this.eventTickets = eventTickets;
    }

    public List<Air_Tickets> getAirTickets() {
        return airTickets;
    }

    public void setAirTickets(List<Air_Tickets> airTickets) {
        this.airTickets = airTickets;
    }

    @Override
    public String toString() {
        return "Permit{" +
                "IDpermit=" + IDpermit +
                ", agreementDate='" + agreementDate + '\'' +
                ", tourNumber=" + tourNumber +
                '}';
    }
}
