package com.example.salonapi.slot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.salonapi.salonservice.SalonServiceDetail;

public interface SlotRepository
            extends CrudRepository<Slot, Long> {

            }