package com.rossypotentials.Airline.Reservation.System.infrastruture.exceptions;

public class UsernameNotFoundException extends RuntimeException{
    public UsernameNotFoundException(String message) {
        super(message);
    }
}
