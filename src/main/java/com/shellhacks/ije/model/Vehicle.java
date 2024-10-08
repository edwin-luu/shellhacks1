// Vehicle.java
package com.shellhacks.ije.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID vehicleId;

    private String make, model, name;
    private int mpg;

    public Vehicle() {
        // Default constructor
    }

    public Vehicle(String make, String model, String name, int mpg) {
        this.make = make;
        this.model = model;
        this.name = name;
        this.mpg = mpg;
    }
}
