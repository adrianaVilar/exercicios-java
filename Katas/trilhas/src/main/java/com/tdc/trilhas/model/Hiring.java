package com.tdc.trilhas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "hiring")
@Getter
@Setter
public class Hiring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "job_vacancy")
    private int vacancy;

    private int hiring;
    private String field;

}
