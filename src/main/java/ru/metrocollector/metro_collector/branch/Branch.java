package ru.metrocollector.metro_collector.branch;

import jakarta.persistence.*;
import ru.metrocollector.metro_collector.city.*;

@Entity 
@Table(name="branch")
public class Branch {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="branch_id")
    private Integer id;

    @Column(name="branch_name")
    private String name;

    @Column(name="branch_title")
    private String title;

    @Column(name="branch_color")
    private String color;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    public Branch(){

    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public City getCity(){
        return city;
    }

    public String getTitle(){
        return title;
    }

    public String getColor(){
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCity(City city){
        this.city = city;
    }
}
