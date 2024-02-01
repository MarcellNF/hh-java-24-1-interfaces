package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(90, "BMW");
        bmw.drive();
        bmw.brake();
        int speed = bmw.accelerate(10);
        System.out.println(speed);
    }
}