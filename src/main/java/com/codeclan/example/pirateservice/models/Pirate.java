package com.codeclan.example.pirateservice.models;

import javax.persistence.*;

@Entity
@Table(name = "Pirates")

public class Pirate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this is for the database id
    // that comes back and means it's the primary key
    @Column(name = "id")
    private long id; //our database id number

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    private Ship ship;

    public Pirate(){}; //For Hibernate to work we need this and all the getters and setters implemented.
    public Pirate(String firstName, String lastName, int age, Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ship = ship;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
