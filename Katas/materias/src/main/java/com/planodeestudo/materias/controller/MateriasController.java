package com.planodeestudo.materias.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/materia")
@Slf4j
public class MateriasController {

    private static List<String> materias = new ArrayList<>();

    @GetMapping
    public List<String> buscaMaterias() {
        return materias;
    }

    @PostMapping
    public String criaMateria(@RequestBody String materia) {
        log.info("Criando matéria materia={}", materia);
        materias.add(materia);
        return materia;
    }

    @GetMapping("/{posicao}")
    public String buscaMateriaPorPosicao(@PathVariable("posicao") int posicao) {
        log.info("Buscando materia por posicao posicao={}", posicao);
        return materias.get(posicao);
    }

    @PutMapping("/{posicao}")
    public void atualizaMateria(@PathVariable("posicao") int posicao, @RequestBody String materia) {
        log.info("Atualizando materia por posicao posicao={}", posicao);
        materias.remove(posicao);
        materias.add(materia);
    }

    @DeleteMapping("/{posicao}")
    public void deletarMateria(@PathVariable("posicao") int posicao) {
        log.info("Deletando materia por posicao posicao={}", posicao);
        materias.remove(posicao);
    }

}
