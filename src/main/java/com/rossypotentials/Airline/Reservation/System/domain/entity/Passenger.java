package com.rossypotentials.Airline.Reservation.System.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Passengers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Passenger extends BaseClass {
    private String name;
    private String email;

    @OneToMany(mappedBy = "passenger")
    private List<Reservation>reservationList;
}
