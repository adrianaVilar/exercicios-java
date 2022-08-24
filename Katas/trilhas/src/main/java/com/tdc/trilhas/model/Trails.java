package com.tdc.trilhas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="trails")
@Getter
@Setter
public class Trails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String meaning;

    @Column(name = "trail_day")
    private String day;

}
