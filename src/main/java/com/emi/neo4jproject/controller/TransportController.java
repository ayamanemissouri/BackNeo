package com.emi.neo4jproject.controller;

import com.emi.neo4jproject.model.Transport;
import com.emi.neo4jproject.model.Usager;
import com.emi.neo4jproject.repositoy.TransportRepository;
import com.emi.neo4jproject.repositoy.UsagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin("*")
public class TransportController {
    @Autowired
    private TransportRepository transportRepository;

    @GetMapping("/transports")
    @CrossOrigin("*")
    public List<Transport> findAll()
    {
        return this.transportRepository.findAll();
    }
    @PostMapping("/transports")
    @CrossOrigin("*")
    public Transport add(@RequestBody Transport transport)
    {
        return this.transportRepository.save(transport);
    }
    @PutMapping("/transports/{id}")
    @CrossOrigin("*")
    public Transport update(@PathVariable Long id,@RequestBody Transport transport)
    {
        return this.transportRepository.save(transport);
    }

    @DeleteMapping("/transports/{id}")
    @CrossOrigin("*")
    public void delete(@PathVariable Long id)
    {
        this.transportRepository.delete(Objects.requireNonNull(this.transportRepository.findById(id).orElse(null)));
    }
}
