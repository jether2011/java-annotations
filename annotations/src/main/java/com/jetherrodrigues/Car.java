package com.jetherrodrigues;

import java.io.Serializable;

/**
 * @author Jether Rois.
 * 
 * Car is an immutable object.
 * Has a final and private attributes, initialize the values (state of object) in the constructor and implements just getters methods.
 */
public final class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonField("manufacturer")
    private final String make;
    @JsonField
    private final String model;
    private final String year;

    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}