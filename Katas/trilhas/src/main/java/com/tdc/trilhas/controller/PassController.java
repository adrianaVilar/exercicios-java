package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.PassDTO;
import com.tdc.trilhas.model.Pass;
import com.tdc.trilhas.repository.PassRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pass")
@Slf4j
public class PassController {

    @Autowired
    private PassRepository repository;

    @PostMapping
    public Pass createANewPass(@RequestBody PassDTO pass){
        Pass pazz = new Pass();
        pazz.setName(pass.getName());
        pazz.setPrice(pass.getPrice());
        return repository.save(pazz);
    }

    @GetMapping
    public List<Pass> getAllPass(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Pass getPassById(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updatePassById(@PathVariable("id") Long id, @RequestBody PassDTO pass){
        Pass passById = getPassById(id);
        if(passById == null) return;
        passById.setName(pass.getName());
        passById.setPrice(pass.getPrice());
        repository.save(passById);
    }

    @DeleteMapping("/{id}")
    public void deletePassById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
