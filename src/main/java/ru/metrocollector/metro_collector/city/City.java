package ru.metrocollector.metro_collector.city;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int id;

    @Column(name = "city_name",nullable = false, length = 100, unique = true)
    private String name;

    public City(){

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
