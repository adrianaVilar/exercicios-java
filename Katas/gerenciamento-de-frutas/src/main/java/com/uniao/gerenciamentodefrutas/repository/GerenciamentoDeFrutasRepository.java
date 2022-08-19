package com.uniao.gerenciamentodefrutas.repository;

import com.uniao.gerenciamentodefrutas.dto.GerenciamentoDeFrutasDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GerenciamentoDeFrutasRepository {

    private static List<GerenciamentoDeFrutasDTO> gerenciamentoDeFrutas = new ArrayList<>();
    private static int ultimoId = 0;

    public GerenciamentoDeFrutasDTO getForId(int id){
            return gerenciamentoDeFrutas.stream()
                    .filter(gerenciamentoDeFrutas -> gerenciamentoDeFrutas.getId() == id)
                    .findFirst()
                    .orElse(null);
    }

    public GerenciamentoDeFrutasDTO post(GerenciamentoDeFrutasDTO fruta){
        gerenciamentoDeFrutas.add(fruta);
        fruta.setId(ultimoId++);
        return fruta;
    }

    public void deleteForId(int id){
        GerenciamentoDeFrutasDTO oldValue = getForId(id);
        if(oldValue == null) return;
        gerenciamentoDeFrutas.remove(oldValue);
    }

    public GerenciamentoDeFrutasDTO updateForId(int id, GerenciamentoDeFrutasDTO fruitsDTO){
        GerenciamentoDeFrutasDTO oldValue = getForId(id);
        if(oldValue == null) {
            return  null;
        }
        oldValue.setName(fruitsDTO.getName());
        return oldValue;
    }

    public static List<GerenciamentoDeFrutasDTO> getGerenciamentoDeFrutas() {
        return gerenciamentoDeFrutas;
    }
}
