package com.codeclan.example.pirateservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "pirates") //adds a column of Pirates in ship table which holds an arrayList of pirates.
    @JsonIgnoreProperties({"ship"})
    @OneToMany(mappedBy = "ship") //one ship has many pirates in
    private List<Pirate> pirates; //List of pirates for this ship

    public Ship(){}; //empty constructor for POJO

    public Ship(String name) {
        this.name = name;
        this.pirates = new ArrayList<Pirate>();
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

    public List<Pirate> getPirates() {
        return pirates;
    }

    public void setPirates(List<Pirate> pirates) {
        this.pirates = pirates;
    }
}
