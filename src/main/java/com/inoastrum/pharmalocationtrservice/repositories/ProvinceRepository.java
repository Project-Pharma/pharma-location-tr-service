package com.inoastrum.pharmalocationtrservice.repositories;

import com.inoastrum.pharmalocationtrservice.domain.Province;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProvinceRepository extends Repository<Province, Integer> {

    @Query(value = "SELECT * FROM PROVINCES",
            nativeQuery = true)
    List<Province> findAllProvinces();
}
