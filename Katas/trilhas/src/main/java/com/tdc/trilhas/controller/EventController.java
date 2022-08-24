package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.EventDTO;
import com.tdc.trilhas.model.Event;
import com.tdc.trilhas.repository.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
@Slf4j
public class EventController {

    @Autowired
    private EventRepository repository;

    @PostMapping
    public Event createANewEvent(@RequestBody EventDTO event){
        Event events = new Event();
        events.setLocation(event.getLocation());
        events.setDate(event.getDate());
        return repository.save(events);
    }

    @GetMapping
    public List<Event> getAllEvents(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable("id") Long id){
        return repository.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public void updateEventById(@PathVariable("id") Long id, @RequestBody EventDTO event){
        Event eventById = getEventById(id);
        if(eventById == null) return;
        eventById.setLocation(event.getLocation());
        eventById.setDate(event.getDate());
        repository.save(eventById);
    }

    @DeleteMapping("/{id}")
    public void deleteEventById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
