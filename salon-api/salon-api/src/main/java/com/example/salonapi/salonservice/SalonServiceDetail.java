package com.example.salonapi.salonservice;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity                 // Specify Entity class
@Data                   //Implicity adds a required arguments constructor
@NoArgsConstructor      // JPA requires that entities have a no-arguments constructor
@ToString
public class SalonServiceDetail{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String description;
    Long price;
    Integer timeInMinutes;

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Long getPrice(){
        return price;
    }

    public Integer getTimeInMinutes(){
        return timeInMinutes;
    }
}