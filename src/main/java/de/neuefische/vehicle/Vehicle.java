package de.neuefische.vehicle;

import java.util.Objects;

public class Vehicle {
    private int ps;
    private String brand;

    public Vehicle(int ps, String brand) {
        this.ps = ps;
        this.brand = brand;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void drive(){
        System.out.println("I am driving!");
    }

    public void brake(){
        System.out.println("I am breaking");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return ps == vehicle.ps && Objects.equals(brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ps, brand);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ps=" + ps +
                ", brand='" + brand + '\'' +
                '}';
    }
}
