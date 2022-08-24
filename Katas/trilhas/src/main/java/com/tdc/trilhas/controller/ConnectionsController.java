package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.ConnectionsDTO;
import com.tdc.trilhas.model.Connections;
import com.tdc.trilhas.repository.ConnectionsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/connection")
@Slf4j
public class ConnectionsController {

    @Autowired
    private ConnectionsRepository repository;

    @PostMapping
    public Connections createANewConnection(@RequestBody ConnectionsDTO connection){
        Connections connections = new Connections();
        connections.setName(connection.getName());
        connections.setNetwork(connection.getNetwork());
        return repository.save(connections);
    }

    @GetMapping
    public List<Connections> getAllConnections(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Connections getConnectionById(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updateConnectionById(@PathVariable("id") Long id, @RequestBody ConnectionsDTO connections){
        Connections connectionById = getConnectionById(id);
        connectionById.setName(connections.getName());
        connectionById.setNetwork(connections.getNetwork());
        repository.save(connectionById);
    }

    @DeleteMapping("/{id}")
    public void deleteConnectionById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }


}
