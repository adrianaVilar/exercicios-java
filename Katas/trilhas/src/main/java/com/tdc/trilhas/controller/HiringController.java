package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.HiringDTO;
import com.tdc.trilhas.model.Hiring;
import com.tdc.trilhas.repository.HiringRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hiring")
@Slf4j
public class HiringController {

    @Autowired
    private HiringRepository repository;

    @PostMapping
    public Hiring createANewHiring(@RequestBody HiringDTO hiring){
        Hiring hirings = new Hiring();
        hirings.setVacancy(hiring.getVacancy());
        hirings.setHiring(hiring.getHiring());
        hirings.setField(hiring.getField());
        return repository.save(hirings);
    }

    @GetMapping
    public List<Hiring> getAllHirings(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Hiring getHiringById(@PathVariable("id") Long id){
        return repository.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public void updateHiringById(@PathVariable("id") Long id, @RequestBody HiringDTO hiring){
        Hiring hiringById = getHiringById(id);
        if(hiringById == null) return;
        hiringById.setVacancy(hiring.getVacancy());
        hiringById.setHiring(hiring.getHiring());
        hiringById.setField(hiring.getField());
        repository.save(hiringById);
    }

    @DeleteMapping("/{id}")
    public void deleteHiringById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }
}
