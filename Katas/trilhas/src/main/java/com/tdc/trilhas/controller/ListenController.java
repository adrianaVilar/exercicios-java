package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.ListenDTO;
import com.tdc.trilhas.model.Listen;
import com.tdc.trilhas.repository.ListenRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listener")
@Slf4j
public class ListenController {

    @Autowired
    private ListenRepository repository;

    @PostMapping
    public Listen createANewListener(@RequestBody ListenDTO listener){
        Listen listeners = new Listen();
        listeners.setName(listener.getName());
        listeners.setOccupation(listener.getOccupation());
        return repository.save(listeners);
    }

    @GetMapping
    public List<Listen> getAllListener(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Listen getListenerById(@PathVariable("id") Long id){
        return repository.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public void updateListenerById(@PathVariable("id") Long id, @RequestBody ListenDTO listener){
        Listen listenerById = getListenerById(id);
        if(listenerById == null) return;
        listenerById.setName(listener.getName());
        listenerById.setOccupation(listener.getOccupation());
        repository.save(listenerById);
    }

    @DeleteMapping("/{id}")
    public void deleteListenerById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
