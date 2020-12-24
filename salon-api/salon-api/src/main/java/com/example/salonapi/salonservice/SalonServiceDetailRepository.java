package com.example.salonapi.salonservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// extends CrudRepository<[type of repository to persist], [entity ID property]>
public interface SalonServiceDetailRepository          
            extends CrudRepository<SalonServiceDetail, Long> {
    @Override
    List<SalonServiceDetail> findAll();
}