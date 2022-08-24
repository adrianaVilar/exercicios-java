package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.LastKataDTO;
import com.tdc.trilhas.model.LastKata;
import com.tdc.trilhas.repository.LastKataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/last")
@Slf4j
public class LastKataController {

    @Autowired
    private LastKataRepository repository;

    @PostMapping
    public LastKata createANewKata(@RequestBody LastKataDTO lastKata){
        LastKata lastKatas = new LastKata();
        lastKatas.setName(lastKata.getName());
        return repository.save(lastKatas);
    }

    @GetMapping
    public List<LastKata> getAllKatas(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public LastKata getKataById(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updateKataById(@PathVariable("id") Long id, @RequestBody LastKataDTO lastKata){
        LastKata kataById = getKataById(id);
        if(kataById == null) return;
        kataById.setName(lastKata.getName());
        repository.save(kataById);
    }

    @DeleteMapping("/{id}")
    public void deleteKataById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
