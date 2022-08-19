package com.regras.ingles.controller;

import com.regras.ingles.dto.InglesDTO;
import com.regras.ingles.repository.InglesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/regras")
@Slf4j
public class InglesController {

    @Autowired
    private InglesRepository inglesRepository;

    @GetMapping
    public List<InglesDTO> getRules(){
        return inglesRepository.getAllRules();
    }

    @PostMapping
    public InglesDTO createRule(@RequestBody InglesDTO rule){
        log.info("Criando regras regra={}", rule);
        return inglesRepository.create(rule);
    }

    @GetMapping("/{id}")
    public InglesDTO getRuleForId(@PathVariable("id") int id){
        log.info("Buscando regras por id id={}", id);
        return inglesRepository.getForId(id);
    }

    @PutMapping("/{id}")
    public void updateRuleForId(@PathVariable("id") int id, @RequestBody InglesDTO rule){
        log.info("Atualizando regra por id regra={} id={}", rule, id);
        inglesRepository.putForId(id, rule);
    }

    @DeleteMapping("/{id}")
    public void deleteRuleForId(@PathVariable("id") int id){
        log.info("Deletando regra por id id={}", id);
        inglesRepository.deleteForId(id);
    }

}
