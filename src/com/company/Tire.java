package com.company;

public class Tire {
    private int pressure;
    private String brand;

    public Tire(int pressure, String brand) {
        this.pressure = pressure;
        this.brand = brand;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "pressure=" + pressure +
                ", brand='" + brand + '\'' +
                '}';
    }
}
