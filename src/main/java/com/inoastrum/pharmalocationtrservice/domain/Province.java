package com.inoastrum.pharmalocationtrservice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "provinces")
public class Province {

    @Id
    private Integer id;

    private String name;
}
