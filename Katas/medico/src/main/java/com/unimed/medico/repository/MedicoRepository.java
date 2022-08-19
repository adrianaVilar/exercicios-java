package com.unimed.medico.repository;

import com.unimed.medico.dto.MedicoDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicoRepository {

    private static List<MedicoDTO> medicos = new ArrayList<>();
    private static int ultimoId = 0;

    public MedicoDTO salvar(MedicoDTO medico){
        medicos.add(medico);
        medico.setId(ultimoId++);
        return medico;
    }

    public void deletaPeloId(int id){
        MedicoDTO valorAntigo = buscaPeloId(id);
        if(valorAntigo == null) return;
        medicos.remove(valorAntigo);
    }

    public MedicoDTO buscaPeloId(int id){
        return medicos.stream()// Pega a Stream da lista
                .filter(medico -> medico.getId() == id)// Filtra pelos medicos que tem o id
                .findFirst() // Pega o primeiro (Retorna um Optional -> resultado opcional)
                .orElse(null); // Caso o optional nao tenha conteudo eu dou um valor padrao com o orElse
    }

    public MedicoDTO atualizaPeloId(int id, MedicoDTO medicoDTO){
        MedicoDTO valorAntigo = buscaPeloId(id);
        if(valorAntigo == null) {
            return null;
        }

        valorAntigo.setNome(medicoDTO.getNome());
        return valorAntigo;
    }

    public List<MedicoDTO> buscaTodos(){
        return medicos;
    }

}
