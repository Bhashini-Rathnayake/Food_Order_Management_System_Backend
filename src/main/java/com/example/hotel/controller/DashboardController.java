package com.example.hotel.controller;

import com.example.hotel.model.dto.DashboradDTO;
import com.example.hotel.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dashboard")
public class DashboardController {


    @Autowired
    private DashboardService dashboardService;

    @RequestMapping(value = "/get-all-value",method = RequestMethod.GET)
    public ResponseEntity<DashboradDTO> getAllValue(){
        DashboradDTO dashboardDTO = this.dashboardService.getAllValue();
        return new ResponseEntity<>(dashboardDTO, HttpStatus.OK);
    }
}

