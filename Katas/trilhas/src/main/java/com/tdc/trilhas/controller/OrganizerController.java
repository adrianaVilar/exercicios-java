package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.OrganizerDTO;
import com.tdc.trilhas.model.Organizer;
import com.tdc.trilhas.repository.OrganizerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizer")
@Slf4j
public class OrganizerController {

    @Autowired
    private OrganizerRepository repository;

    @PostMapping
    public Organizer createANewOrganizer(@RequestBody OrganizerDTO organizer){
        Organizer organizers = new Organizer();
        organizers.setName(organizer.getName());
        organizers.setFirm(organizer.getFirm());
        return repository.save(organizers);
    }

    @GetMapping
    public List<Organizer> getAllOrganizers(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Organizer getOrganizerById(@PathVariable("id") Long id){
        return repository.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public void updateOrganizerById(@PathVariable("id") Long id, @RequestBody OrganizerDTO organizer){
        Organizer organizerById = getOrganizerById(id);
        if(organizerById.getId() == null) return;
        organizerById.setName(organizer.getName());
        organizerById.setFirm(organizer.getFirm());
        repository.save(organizerById);
    }

    @DeleteMapping("/{id}")
    public void deleteOrganizerById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
