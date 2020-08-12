package com.inoastrum.pharmalocationtrservice.repositories;

import com.inoastrum.pharmalocationtrservice.domain.District;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface DistrictRepository extends Repository<District, Integer> {

    @Query(value = "SELECT * FROM DISTRICTS",
            nativeQuery = true)
    List<District> findAllDistricts();

    @Query("FROM District WHERE provinceId = ?1")
    List<District> findAllDistrictsByProvinceId(Integer provinceId);
}
