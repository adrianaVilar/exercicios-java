package com.unimed.medico.controller;

import com.unimed.medico.dto.MedicoDTO;
import com.unimed.medico.repository.MedicoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/medicos")
@Slf4j
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;


    @GetMapping
    public List<MedicoDTO> buscaMedicos(){
        return medicoRepository.buscaTodos();
    }

    @PostMapping
    public MedicoDTO criaMedico (@RequestBody MedicoDTO medico){
        log.info("Cria médico médico={}", medico);
        return medicoRepository.salvar(medico);
    }

    @GetMapping("/{id}")
    public MedicoDTO buscaMedicoPorId(@PathVariable("id") int id){
        log.info("Busca médico por id id={}", id);
        return medicoRepository.buscaPeloId(id);
    }

    @PutMapping("/{id}")
    public void atualizaMedicoPorId(@PathVariable("id") int id, @RequestBody MedicoDTO medico){
        log.info("Atualiza médico por posição médico={} id={}", medico, id);
        medicoRepository.atualizaPeloId(id, medico);
    }

    @DeleteMapping("/{id}")
    public void deletaMedicoPorId(@PathVariable("id") int id){
        log.info("Deleta médico por posição id={}", id);
        medicoRepository.deletaPeloId(id);
    }
}
