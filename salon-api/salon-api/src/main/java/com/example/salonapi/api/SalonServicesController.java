package com.example.salonapi.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
// import org.springframework.hateoas.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.salonapi.salonservice.SalonServiceDetail;
import com.example.salonapi.salonservice.SalonServiceDetailRepository;

@RestController
// Handler methods will only handle requests if the request's Accept header
// includes "application/json"
@RequestMapping(path="/api",
                    produces="application/json")
@CrossOrigin(origins="*")
public class SalonServicesController {
    private SalonServiceDetailRepository salonServiceDetailRepo;
    
    @Autowired
    // EntityLinks entityLinks;

    public SalonServicesController(SalonServiceDetailRepository salonServiceDetailRepo){
        this.salonServiceDetailRepo = salonServiceDetailRepo;
    }

    @GetMapping("/services/retrieveAvailableSalonServices")
    public SalonServiceDetail appointmentDetails() {
        return salonServiceDetailRepo.getContent();
    }
}