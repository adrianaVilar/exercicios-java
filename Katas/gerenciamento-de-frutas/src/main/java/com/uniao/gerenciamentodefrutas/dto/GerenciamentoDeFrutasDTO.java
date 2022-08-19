package com.uniao.gerenciamentodefrutas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GerenciamentoDeFrutasDTO {

    private Integer id;
    private String name;
    private String color;
    private String dateHarvest;
    private String dateMaturation;

}
