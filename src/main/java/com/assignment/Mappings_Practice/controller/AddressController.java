package com.assignment.Mappings_Practice.controller;

import com.assignment.Mappings_Practice.model.Address;
import com.assignment.Mappings_Practice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @GetMapping("addresses")
    public Iterable getAllAddress(){
        return addressService.getAllAddress();
    }
}
