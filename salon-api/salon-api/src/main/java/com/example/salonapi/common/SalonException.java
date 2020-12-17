package com.example.salonapi.common;

@SuppressWarnings("serial")
public class SalonException extends RuntimeException{
    
    public SalonException(String message){
        super(message);
    }
}