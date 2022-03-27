package com.spring.classes.POJO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tour")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDtour")
    private Integer IDtour;

    @Column(name="beginningDate")
    private String beginningDate;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "country")
    private Country country;

    @Column(name="description")
    private String tour_name;

    @Column(name="endingDate")
    private String endingDate;

    @Column(name="tourStatus")
    private String tourStatus;

    @ElementCollection
    private List<String> statuses;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Hotel (Bi)
    @OneToOne(mappedBy = "tour",cascade ={CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private Hotel hotel;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Program
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "programNumber")
    private Program program;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ TourType
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tourType_id")
    private TourType tourType;

    //СВЯЗЬ ОДИН КО МНОГИМ С ТАБЛИЦЕЙ TourEvents(Bi)
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "tour")
    @JoinColumn(name = "tourNumber")
    private List<Tour_Events> tourEvents;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ TourTasks (Bi)
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "tour")
    private Tour_Tasks tourTasks;


    public Tour() {
        statuses = new ArrayList<>();
        statuses.add("ПРОДАЕТСЯ");
        statuses.add("НЕ ПРОДАЕТСЯ");
    }

    public Tour(String beginningDate, String tour_name, String endingDate, String tourStatus) {
        this.beginningDate = beginningDate;
        this.tour_name = tour_name;
        this.endingDate = endingDate;
        this.tourStatus = tourStatus;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Tour_Tasks getTourTasks() {
        return tourTasks;
    }

    public void setTourTasks(Tour_Tasks tourTasks) {
        this.tourTasks = tourTasks;
    }

    public List<Tour_Events> getTourEvents() {
        return tourEvents;
    }

    public void setTourEvents(List<Tour_Events> tourEvents) {
        this.tourEvents = tourEvents;
    }

    public Integer getIDtour() {
        return IDtour;
    }

    public void setIDtour(Integer IDtour) {
        this.IDtour = IDtour;
    }

    public String getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(String beginningDate) {
        this.beginningDate = beginningDate;
    }

    public String getTour_name() {
        return tour_name;
    }

    public void setTour_name(String description) {
        this.tour_name = description;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getTourStatus() {
        return tourStatus;
    }

    public void setTourStatus(String tourStatus) {
        this.tourStatus = tourStatus;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "IDtour=" + IDtour +
                ", beginningDate='" + beginningDate + '\'' +
                ", country='" + country + '\'' +
                ", description='" + tour_name + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", tourStatus='" + tourStatus + '\'' +
                '}';
    }
}
