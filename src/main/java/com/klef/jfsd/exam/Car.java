package com.klef.jfsd.exam;

import jakarta.persistence.*;

@Entity
public class Car extends Vehicle {
    @Column(name = "number_of_doors")
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
