package com.coisasdamoto.queestragam.controller;

import com.coisasdamoto.queestragam.dto.EstragaDTO;
import com.coisasdamoto.queestragam.model.Estraga;
import com.coisasdamoto.queestragam.repository.EstragaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motorcicle")
@Slf4j
public class EstragaController {

    @Autowired
    EstragaRepository repository;

    @PostMapping
    public Estraga createANewEstraga(@RequestBody EstragaDTO estraga) {
        Estraga estragam = new Estraga();
        estragam.setName(estraga.getName());
        estragam.setHowOften(estraga.getHowOften());
        return repository.save(estragam);
    }

    @GetMapping
    public List<Estraga> getAllEstraga() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Estraga getEstragaById(@PathVariable("id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updateEstragaById(@PathVariable("id") Long id, @RequestBody EstragaDTO estraga) {
        Estraga estragaById = getEstragaById(id);
        estragaById.setName(estraga.getName());
        estragaById.setHowOften(estraga.getHowOften());
        repository.save(estragaById);
    }

    @DeleteMapping("/{id}")
    public void deleteEstragaById(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

}
