package org.example;

public class BmwCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
