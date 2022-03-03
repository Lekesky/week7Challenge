package com.company;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private List<Tire> tires;

    public Car(String model, Engine engine, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", tires=" + tires +
                '}';
    }
}
