package com.example.salonapi.salonservice;

import org.springframework.data.repository.CrudRepository;

// extends CrudRepository<[type of repository to persist], [entity ID property]>
public interface SalonServiceDetailRepository          
            extends CrudRepository<SalonServiceDetail, Long> {

            }