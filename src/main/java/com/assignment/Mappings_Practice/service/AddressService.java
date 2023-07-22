package com.assignment.Mappings_Practice.service;

import com.assignment.Mappings_Practice.model.Address;
import com.assignment.Mappings_Practice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address added!";

    }

    public Iterable getAllAddress() {
        return addressRepo.findAll();
    }
}
