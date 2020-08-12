package com.inoastrum.pharmalocationtrservice.web.controller;

import com.inoastrum.pharmalocationtrservice.domain.District;
import com.inoastrum.pharmalocationtrservice.domain.Province;
import com.inoastrum.pharmalocationtrservice.services.LocationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/location")
@Slf4j
@RestController
public class LocationController {

    private final LocationService locationService;

    @GetMapping("/districts")
    public ResponseEntity<List<District>> getDistricts() {
        return new ResponseEntity<>(locationService.getDistricts(), HttpStatus.OK);
    }

    @GetMapping("/provinces")
    public ResponseEntity<List<Province>> getProvinces() {
        return new ResponseEntity<>(locationService.getProvinces(), HttpStatus.OK);
    }

    @GetMapping("/districts/{provinceId}")
    public ResponseEntity<List<District>> getDistrictsByProvinceId(@PathVariable Integer provinceId) {
        return new ResponseEntity<>(locationService.getDistrictsByProvinceId(provinceId), HttpStatus.OK);
    }
}
