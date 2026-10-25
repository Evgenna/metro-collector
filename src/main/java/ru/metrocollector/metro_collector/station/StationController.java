package ru.metrocollector.metro_collector.station;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/stations")
public class StationController {
    private final StationRepository stationRepository;

    public StationController(StationRepository stationRepository){
        this.stationRepository = stationRepository;
    }

    @GetMapping
    public List<Station> getAll(){
        return stationRepository.findAll();
    }
}
