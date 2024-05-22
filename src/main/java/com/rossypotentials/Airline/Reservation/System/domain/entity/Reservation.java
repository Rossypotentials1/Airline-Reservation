package com.rossypotentials.Airline.Reservation.System.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Reservations")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "passenger_Id")
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name = "flight_Id")
    private Flight flight;
}
