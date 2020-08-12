package com.inoastrum.pharmalocationtrservice.services;

import com.inoastrum.pharmalocationtrservice.domain.District;
import com.inoastrum.pharmalocationtrservice.domain.Province;

import java.util.List;

public interface LocationService {
    List<District> getDistricts();

    List<Province> getProvinces();

    List<District> getDistrictsByProvinceId(Integer provinceId);
}
