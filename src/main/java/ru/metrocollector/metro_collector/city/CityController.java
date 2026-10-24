package ru.metrocollector.metro_collector.city;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/api/cities")
public class CityController {
    
    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }

    @GetMapping 
    public List<City> getAll(){
        return cityRepository.findAll();
    }
}
