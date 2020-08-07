package org.example;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = createCarFactoryByBrand("bmw");
        Car car = carFactory.createCar();

        car.drive();
    }

    static CarFactory createCarFactoryByBrand(String brand){
        if(brand.equalsIgnoreCase("bmw")){
            return new BmwCarFactory();
        }else if(brand.equalsIgnoreCase("mercedes")){
            return  new MercedesCarFactory();
        }else if(brand.equalsIgnoreCase("audi")){
            return new AudiCarFactory();
        }else throw new RuntimeException(brand + " unknown");
    }
}
