package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.AwardDTO;
import com.tdc.trilhas.model.Award;
import com.tdc.trilhas.repository.AwardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/award")
@Slf4j
public class AwardController {

    @Autowired
    private AwardRepository repository;

    @PostMapping
    public Award createANewAward(@RequestBody AwardDTO award){
        Award awards = new Award();
        awards.setName(award.getName());
        awards.setVoucher(award.isVoucher());
        awards.setFirm(award.getFirm());
        return repository.save(awards);
    }

    @GetMapping
    public List<Award> getAllAwards(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Award getAwardById(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updateAwardById(@PathVariable("id") Long id, @RequestBody AwardDTO award){
        Award awardById = getAwardById(id);
        if(awardById == null) return;
        awardById.setName(award.getName());
        awardById.setVoucher(award.isVoucher());
        awardById.setFirm(award.getFirm());
        repository.save(awardById);
    }

    @DeleteMapping("/{id}")
    public void deleteAwardById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
