package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.TrailsDTO;
import com.tdc.trilhas.model.Trails;
import com.tdc.trilhas.repository.TrailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trails")
@Slf4j
public class TrailsController {

    @Autowired
    private TrailsRepository repository;

    @PostMapping
    public Trails createANewTrail(@RequestBody TrailsDTO trail){
        Trails trails = new Trails();
        trails.setDay((trail.getDay()));
        trails.setMeaning(trail.getMeaning());
        trails.setName(trail.getName());
        return repository.save(trails);
    }

    @GetMapping
    public List<Trails> getTrails(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Trails getTrailById(@PathVariable("id") Long id){
        return repository.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public void updateTrailById(@PathVariable("id") Long id, @RequestBody TrailsDTO trail){
        Trails trailById = getTrailById(id);
        if(trailById == null) return;
        trailById.setDay(trail.getDay());
        trailById.setMeaning(trail.getMeaning());
        trailById.setName(trail.getName());
        repository.save(trailById);

    }

    @DeleteMapping("/{id}")
    public void deleteTrailById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }
}
