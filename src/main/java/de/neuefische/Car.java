package de.neuefische;

import java.util.Objects;

public class Car implements Vehicle{

    private int ps;
    private String brand;
    private int actualSpeed;

    public Car(int ps, String brand) {
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

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    @Override
    public void drive() {
        System.out.println("I am driving!");
    }

    @Override
    public void brake() {
        System.out.println("I am breaking!");
    }

    @Override
    public int accelerate(int x) {
        return actualSpeed += x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return ps == car.ps && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ps, brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "ps=" + ps +
                ", brand='" + brand + '\'' +
                '}';
    }
}
