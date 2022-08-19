package com.uniao.gerenciamentodefrutas.controller;

import com.uniao.gerenciamentodefrutas.dto.GerenciamentoDeFrutasDTO;
import com.uniao.gerenciamentodefrutas.repository.GerenciamentoDeFrutasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerenciamentoDeFrutas")
@Slf4j
public class GerenciamentoDeFrutasController {

    @Autowired
    private GerenciamentoDeFrutasRepository gerenciamentoDeFrutasRepository;

    @GetMapping
    public List<GerenciamentoDeFrutasDTO> getFruits(){
        log.info("Buscando todas as frutas");
        return gerenciamentoDeFrutasRepository.getGerenciamentoDeFrutas();
    }

    @PostMapping
    public GerenciamentoDeFrutasDTO createFruits(@RequestBody GerenciamentoDeFrutasDTO fruit){
        log.info("Criando frutas fruta={}", fruit);
        return gerenciamentoDeFrutasRepository.post(fruit);
    }

    @GetMapping("/{id}")
    public GerenciamentoDeFrutasDTO getFruitForId(@PathVariable("id") int id){
        log.info("Buscando fruta por id id={}", id);
        return gerenciamentoDeFrutasRepository.getForId(id);
    }

    @PutMapping("/{id}")
    public void updateFruitForId(@PathVariable("id") int id, @RequestBody GerenciamentoDeFrutasDTO fruit){
        log.info("Atualizando fruta por id fruta={} id={}", fruit, id);
        gerenciamentoDeFrutasRepository.updateForId(id, fruit);
    }

    @DeleteMapping("/{id}")
    public void deleteFruitForId(@PathVariable("id") int id){
        log.info("Deletando fruta por id id={}", id);
        gerenciamentoDeFrutasRepository.deleteForId(id);
    }

}
