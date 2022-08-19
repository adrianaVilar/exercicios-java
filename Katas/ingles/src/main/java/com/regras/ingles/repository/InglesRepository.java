package com.regras.ingles.repository;

import com.regras.ingles.dto.InglesDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InglesRepository {

    private static List<InglesDTO> rules = new ArrayList<>();
    private static int ultimoId = 0;

    public InglesDTO create(InglesDTO rule) {
        rules.add(rule);
        rule.setId(ultimoId++);
        return rule;
    }

    public List<InglesDTO> getAllRules(){
        return rules;
    }

    public InglesDTO getForId(int id){
        return rules.stream()
                .filter(rule -> rule.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public InglesDTO putForId(int id, InglesDTO inglesDTO){
        InglesDTO oldValue = getForId(id);
        if(oldValue == null){
            return null;
        }

        oldValue.setName(inglesDTO.getName());
        oldValue.setDay(inglesDTO.getDay());
        oldValue.setMeaning(inglesDTO.getMeaning());
        return oldValue;
    }

    public void deleteForId(int id){
        InglesDTO oldValue = getForId(id);
        if(oldValue == null) return;
        rules.remove(oldValue);
    }

}
