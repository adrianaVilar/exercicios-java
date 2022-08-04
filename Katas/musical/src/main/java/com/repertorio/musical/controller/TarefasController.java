package com.repertorio.musical.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarefa")
@Slf4j
public class TarefasController {

    private static List<String> tarefas = new ArrayList<>();

    @GetMapping
    public List<String> buscaTarefas(){
        return tarefas;
    }

    @PostMapping
    public String criaTarefa(@RequestBody String tarefa){
        log.info("Criando tarefa tarefa={}", tarefa);
        tarefas.add(tarefa);
        return tarefa;
    }

    @GetMapping("/{posicao}")
    public String pegaPorPosicao(@PathVariable("posicao") Integer posicao){
        log.info("Buscando tarefa por posicao={}", posicao);
        return tarefas.get(posicao);
    }

    @PutMapping("/{posicao}")
    public void atualizaTarefa(@RequestBody String tarefa, @PathVariable("posicao") int posicao){
        log.info("Atualizando a tarefa por posicao={}", posicao);
        tarefas.remove(posicao);
        tarefas.add(tarefa);
    }

    @DeleteMapping("/{posicao}")
    public void deletaTarefa(@PathVariable("posicao") int posicao){
        log.info("Deletando a tarefa por posicao={}", posicao);
        tarefas.remove(posicao);
    }

}
