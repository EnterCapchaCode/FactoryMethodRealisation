package org.example;

public class MercedesCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}
