package ru.metrocollector.metro_collector.branch;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/branches")
public class BranchController {
    private final BranchRepository branchRepository;

    public BranchController(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @GetMapping
    public List<Branch> getAll() {
        return branchRepository.findAll();
    }

    @GetMapping("/{id}")
    public Branch getBranch(@PathVariable Integer id) {
        return branchRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Branch not found"));
    }
}
