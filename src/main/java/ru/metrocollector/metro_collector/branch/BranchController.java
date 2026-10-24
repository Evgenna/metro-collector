package ru.metrocollector.metro_collector.branch;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/api/branches")
public class BranchController {
    private final BranchRepository branchRepository;

    public BranchController(BranchRepository branchRepository){
        this.branchRepository = branchRepository;
    }

    @GetMapping 
    public List<Branch> getAll(){
        return branchRepository.findAll();
    }
}
