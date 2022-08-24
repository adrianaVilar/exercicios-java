package com.tdc.trilhas.controller;

import com.tdc.trilhas.dto.CareerDTO;
import com.tdc.trilhas.model.Career;
import com.tdc.trilhas.repository.CareerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/career")
@Slf4j
public class CareerController {

    @Autowired
    private CareerRepository repository;

    @PostMapping
    private Career createANewCareer(@RequestBody CareerDTO career){
        Career careers = new Career();
        careers.setVacancy(career.getVacancy());
        careers.setFirm(career.getFirm());
        return repository.save(careers);
    }

    @GetMapping
    private List<Career> getAllCareers(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    private Career getCareerById(@PathVariable("id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    private void updateCareerById(@PathVariable("id") Long id, @RequestBody CareerDTO career){
        Career careerById = getCareerById(id);
        careerById.setVacancy(career.getVacancy());
        careerById.setFirm(career.getFirm());
        repository.save(careerById);
    }

    @DeleteMapping("/{id}")
    private void deleteCareerById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }


}
