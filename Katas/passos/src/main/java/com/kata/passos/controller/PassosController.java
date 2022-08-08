package com.kata.passos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/passo")
@Slf4j
public class PassosController {

    private static List<String> passos = new ArrayList<>();

    @GetMapping
    public List<String> buscaPassos(){
        return passos;
    }

    @PostMapping
    public String criaPasso(@RequestBody String passo){
        log.info("Criando passo passo={}", passo);
        passos.add(passo);
        return passo;
    }

    @GetMapping("/{posicao}")
    public String buscaPassoPorPosicao(@PathVariable("posicao") int posicao){
        log.info("Buscando passo por posicao posicao={}", posicao);
        return passos.get(posicao);
    }

    @PutMapping("/{posicao}")
    public List<String> atualizaPassoPorPosicao(@PathVariable("posicao") int posicao, @RequestBody String passo){
        log.info("Atualizando passo por posicao posicao={}", posicao);
        passos.remove(posicao);
        passos.add(passo);
        return passos;
    }

    @DeleteMapping("/{posicao}")
    public void deletaPassoPorPosicao(@PathVariable("posicao") int posicao){
        log.info("Deletando passo por posicao posicao={}", posicao);
        passos.remove(posicao);
    }
}
