package com.apartamentos.vistos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apartamentos")
@Slf4j

public class VistosController {

    private List<String> apartamentos = new ArrayList<>();

    @GetMapping
    public List<String> buscaApartamentos(){
        return apartamentos;
    }

    @PostMapping
    public String criaApartamentos(@RequestBody String apartamento){
        log.info("Criando apartamento apartamento={}", apartamento);
        apartamentos.add(apartamento);
        return apartamento;
    }

    @GetMapping("/{posicao}")
    public String buscaApartamentoPorPosicao(@PathVariable("posicao") int posicao){
        log.info("Buscando apartamento por posicao posicao={}", posicao);
        return apartamentos.get(posicao);
    }

    @PutMapping("/{posicao}")
    public void atualizaApartamentoPorPosicao(@PathVariable("posicao") int posicao, @RequestBody String apartamento){
        log.info("Atualizando apartamento por posicao posicao={} apartamento={}", posicao, apartamento);
        apartamentos.remove(posicao);
        apartamentos.add(apartamento);
    }

    @DeleteMapping("/{posicao}")
    public void deletaApartamentoPorPosicao(@PathVariable("posicao") int posicao){
        log.info("Deleta apartamento por posicao posicao={}", posicao);
        apartamentos.remove(posicao);
    }

}
