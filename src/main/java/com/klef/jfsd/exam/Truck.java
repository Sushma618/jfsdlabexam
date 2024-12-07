package com.klef.jfsd.exam;

import jakarta.persistence.*;

@Entity
public class Truck extends Vehicle {
    @Column(name = "load_capacity")
    private double loadCapacity;

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

