package com.assignment.Mappings_Practice.controller;

import com.assignment.Mappings_Practice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;
}
