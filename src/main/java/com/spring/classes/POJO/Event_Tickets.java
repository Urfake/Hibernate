package com.spring.classes.POJO;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="eventtickets")
public class Event_Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDeventTickets")
    private Integer IDeventTickets;

    @Column(name="place")
    private Integer place;

    //СВЯЗЬ МНОГИЕ К ОДНОМУ С ТАБЛИЦЕЙ TourEvents
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tourEvent_id")
    private Tour_Events tourEvents;

    //СВЯЗЬ МНОГИЕ КО МНОГИМ С ТАБЛИЦЕЙ Permit
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "permit_tourTicket",
                joinColumns = @JoinColumn(name = "ticket_id"),
                inverseJoinColumns = @JoinColumn(name = "permit_id"))
    private List<Permit> permitList;

    public Event_Tickets() {
    }

    public Event_Tickets(Integer place) {
        this.place = place;
    }

    public Integer getIDeventTickets() {
        return IDeventTickets;
    }

    public void setIDeventTickets(Integer IDeventTickets) {
        this.IDeventTickets = IDeventTickets;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public List<Permit> getPermitList() {
        return permitList;
    }

    public void setPermitList(List<Permit> permitList) {
        this.permitList = permitList;
    }

    public Tour_Events getTourEvents() {
        return tourEvents;
    }

    public void setTourEvents(Tour_Events tourEvents) {
        this.tourEvents = tourEvents;
    }

    @Override
    public String toString() {
        return "EventTickets{" +
                "IDeventTickets=" + IDeventTickets +
                ", place=" + place +
                '}';
    }
}
