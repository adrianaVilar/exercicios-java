package com.topway.assuntos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/assunto")
@Slf4j
public class AssuntosController {

    private List<String> assuntos = new ArrayList<>();

    @GetMapping
    public List<String> buscaAssuntos(){
        return assuntos;
    }

    @PostMapping
    public String criaAssunto(@RequestBody String assunto){
        log.info("Criando assunto assunto={assunto}");
        assuntos.add(assunto);
        return assunto;
    }

    @GetMapping("/{posicao}")
    public String buscaAssuntoPorPosicao(@PathVariable("posicao") int posicao){
        log.info("Buscando assunto por posição posicao={posicao}");
        return assuntos.get(posicao);
    }

    @PutMapping("/{posicao}")
    public List<String> atualizaAssuntoPorPosicao(@PathVariable("posicao") int posicao, @RequestBody String assunto){
        log.info("Atualizando assunto por posição posicao={posicao}");
        assuntos.remove(posicao);
        assuntos.add(assunto);
        return assuntos;
    }

    @DeleteMapping("/{posicao}")
    public void deletaAssuntoPorPosicao(@PathVariable("posicao") int posicao) {
        log.info("Deletando assunto por posição posicao={posicao}");
        assuntos.remove(posicao);
    }
}
