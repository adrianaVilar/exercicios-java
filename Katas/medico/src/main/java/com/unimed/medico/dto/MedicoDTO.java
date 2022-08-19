package com.unimed.medico.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicoDTO {

    private Integer id;
    private String nome;
    private String especialidade;
    @JsonProperty("CRM")
    private String crm;
    private String dataDeInicio;

}
