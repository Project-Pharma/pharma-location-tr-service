package com.inoastrum.pharmalocationtrservice.services;

import com.inoastrum.pharmalocationtrservice.domain.District;
import com.inoastrum.pharmalocationtrservice.domain.Province;
import com.inoastrum.pharmalocationtrservice.repositories.DistrictRepository;
import com.inoastrum.pharmalocationtrservice.repositories.ProvinceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LocationServiceImpl implements LocationService {

    private final ProvinceRepository provinceRepository;
    private final DistrictRepository districtRepository;

    @Override
    public List<District> getDistricts() {
        return districtRepository.findAllDistricts();
    }

    @Override
    public List<Province> getProvinces() {
        return provinceRepository.findAllProvinces();
    }

    @Override
    public List<District> getDistrictsByProvinceId(Integer provinceId) {
        return districtRepository.findAllDistrictsByProvinceId(provinceId);
    }
}
