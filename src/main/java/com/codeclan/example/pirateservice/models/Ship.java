package com.codeclan.example.pirateservice.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Ships")
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this is for the database id
    // that comes back and means it's the primary key
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "pirates")
    private ArrayList<Pirate> pirates;

    public Ship(){}; //empty constructor

    public Ship(String name, ArrayList<Pirate> pirates) {
        this.name = name;
        this.pirates = pirates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pirate> getPirates() {
        return pirates;
    }

    public void setPirates(ArrayList<Pirate> pirates) {
        this.pirates = pirates;
    }
}
