package ru.metrocollector.metro_collector.station;

import java.util.jar.Attributes.Name;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import ru.metrocollector.metro_collector.branch.Branch;

@Entity 
@Table(name="station")
public class Station {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="station_id")
    private Integer id;

    @Column(name="station_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

    public Station(){
        
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Branch getBranch(){
        return branch;
    }
}
