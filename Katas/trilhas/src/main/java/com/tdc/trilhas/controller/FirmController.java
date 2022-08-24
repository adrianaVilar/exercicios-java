package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.FirmDTO;
import com.tdc.trilhas.model.Firm;
import com.tdc.trilhas.repository.FirmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/firm")
@Slf4j
public class FirmController {

    @Autowired
    private FirmRepository repository;

    @PostMapping
    public Firm createANewFirm(@RequestBody FirmDTO firm){
        Firm firms = new Firm();
        firms.setName(firm.getName());
        firms.setBranch(firm.getBranch());
        return repository.save(firms);
    }

    @GetMapping
    public List<Firm> getFirms(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Firm getFirmById(@PathVariable("id") Long id){
        return repository.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable("id") Long id, @RequestBody FirmDTO firm){
        Firm firmById = getFirmById(id);
        if(firmById == null) return;
        firmById.setName(firm.getName());
        firmById.setBranch(firm.getBranch());
        repository.save(firmById);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }


}
