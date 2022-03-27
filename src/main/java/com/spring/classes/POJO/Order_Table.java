package com.spring.classes.POJO;
import javax.persistence.*;

@Entity
@Table(name="ordertable")
public class Order_Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDorder")
    private int IDorder;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tour_id")
    private Tour tour;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "staff_id")
    private Staff staff;


    public Order_Table() {
    }


    public int getIDorder() {
        return IDorder;
    }

    public void setIDorder(int IDorder) {
        this.IDorder = IDorder;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "OrderTable{" +
                "IDorder=" + IDorder +
                '}';
    }
}
