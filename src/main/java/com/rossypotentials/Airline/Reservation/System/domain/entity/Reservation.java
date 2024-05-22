package com.rossypotentials.Airline.Reservation.System.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Reservations")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservation {
    @ManyToOne
    @JoinColumn(name = "passenger_Id")
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name = "flight_Id")
    private Flight flight;
}
