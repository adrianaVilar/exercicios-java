package com.doceria.doces.controller;

import com.doceria.doces.dto.CandyDTO;
import com.doceria.doces.model.Candy;
import com.doceria.doces.repository.CandyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candy")
@Slf4j
public class CandyController {

    @Autowired
    private CandyRepository repository;

    @PostMapping
    public Candy createANewCandy(@RequestBody CandyDTO candy){
        Candy candys = new Candy();
        candys.setName(candy.getName());
        candys.setColor(candy.getColor());
        return repository.save(candys);
    }

    @GetMapping
    public List<Candy> getAllCandys(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Candy getCandyById(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updateCandyById(@PathVariable("id") Long id, @RequestBody CandyDTO candy){
        Candy candyById = getCandyById(id);
        if(candyById == null) return;
        candyById.setName(candy.getName());
        candyById.setColor(candy.getColor());
        repository.save(candyById);
    }

    @DeleteMapping("/{id}")
    public void deleteCandyById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }
}
