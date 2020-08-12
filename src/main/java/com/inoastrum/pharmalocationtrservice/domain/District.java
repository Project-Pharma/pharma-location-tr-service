package com.inoastrum.pharmalocationtrservice.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "districts")
public class District {

    @Id
    private Integer id;

    private String name;

    @Column(name = "province_id")
    private Integer provinceId;
}
