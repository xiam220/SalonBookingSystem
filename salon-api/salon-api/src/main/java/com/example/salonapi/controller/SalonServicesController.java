package com.example.salonapi.api.services;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
// import org.springframeowkr.data.jpa.repository.JpaRepository;
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
// Handler methods will only handle requests if the request's Accept header includes "*/*"
// @RequestMapping(path="/api",
//                     produces="*/*")
@CrossOrigin(origins="*")
public class SalonServicesController {
    private SalonServiceDetailRepository salonServiceDetailRepo;
    
    // @Autowired
    // EntityLinks entityLinks;

    public SalonServicesController(SalonServiceDetailRepository salonServiceDetailRepo){
        this.salonServiceDetailRepo = salonServiceDetailRepo;
    }

    @GetMapping("/api/services/retrieveAvailableSalonService")
    public List<SalonServiceDetail> retrieveAvailableSalonServiceAPI() {
        return salonServiceDetailRepo.findAll();
    }
}