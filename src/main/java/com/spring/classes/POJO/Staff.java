package com.spring.classes.POJO;
import javax.persistence.*;

@Entity
@Table(name="staff")
public class Staff {

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "position_id")
    private Position position;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDstaff")
    private int IDstaff;

    @Column(name="address")
    private String address;

    @Column(name="fullName")
    private String fullName;

    @Column(name="passportID")
    private int passportID;

    public Staff() {
    }

    public Staff(String address, String fullName, int passportID) {
        this.address = address;
        this.fullName = fullName;
        this.passportID = passportID;
    }



    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getIDstaff() {
        return IDstaff;
    }

    public void setIDstaff(int IDstaff) {
        this.IDstaff = IDstaff;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPassportID() {
        return passportID;
    }

    public void setPassportID(int passwortID) {
        this.passportID = passwortID;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "IDstaff=" + IDstaff +
                ", address='" + address + '\'' +
                ", fullName='" + fullName + '\'' +
                ", passwortID=" + passportID +
                '}';
    }
}
