package com.lanches.lanche.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lanche")
@Slf4j

public class LancheController {

    private List<String> lanches = new ArrayList<>();

    @GetMapping
    public List<String> buscaLanche(){
        return lanches;
    }

    @PostMapping
    public String criaLanches(@RequestBody String lanche){
        log.info("Criando lanche lanche={lanche}");
        lanches.add(lanche);
        return lanche;
    }

    @GetMapping("/{posicao}")
    public String buscaLanchePorPosicao(@PathVariable("posicao") int posicao){
        log.info("Buscando lanche por posicao posicao={posicao}");
        return lanches.get(posicao);
    }

    @PutMapping("/{posicao}")
    public void atualizaLanchePorPosicao(@PathVariable("posicao") int posicao, @RequestBody String lanche){
        log.info("Atualiza lanche por posicao posicao={posicao}");
        lanches.remove(posicao);
        lanches.add(lanche);
    }

    @DeleteMapping("/{posicao}")
    public void deletaPorPosicao(@PathVariable("posicao") int posicao){
        log.info("Deletando lanche por posicao posicao={posicao}");
        lanches.remove(posicao);
    }
}
