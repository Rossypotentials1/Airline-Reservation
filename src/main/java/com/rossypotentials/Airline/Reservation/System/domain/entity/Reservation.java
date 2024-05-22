package com.rossypotentials.Airline.Reservation.System.domain.entity;

import jakarta.persistence.Entity;
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

}
