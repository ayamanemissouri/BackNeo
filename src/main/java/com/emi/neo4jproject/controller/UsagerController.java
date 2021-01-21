package com.emi.neo4jproject.controller;

import com.emi.neo4jproject.model.Usager;
import com.emi.neo4jproject.repositoy.UsagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-neo4j")
@CrossOrigin("*")
public class UsagerController {
    @Autowired
    private UsagerRepository usagerRepository;

@GetMapping("/usagers")
@CrossOrigin("*")
    public List<Usager> findAll()
{
    return this.usagerRepository.findAll();
}
@PostMapping("/usagers")
@CrossOrigin("*")
    public Usager add(@RequestBody Usager usager)
{
    return this.usagerRepository.save(usager);
}
@PutMapping("/usagers/{id}")
@CrossOrigin("*")
    public Usager update(@PathVariable Long id,@RequestBody Usager usager)
{
    return this.usagerRepository.save(usager);
}

@DeleteMapping("/usagers/{id}")
@CrossOrigin("*")
    public void delete(@PathVariable Long id)
{
     this.usagerRepository.delete(this.usagerRepository.findById(id).orElse(null));
}

}
