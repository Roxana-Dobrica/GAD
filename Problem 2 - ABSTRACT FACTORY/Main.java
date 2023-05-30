package com.mycompany.abstractfactory;


public class Main {

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        Vehicle car = carFactory.createVehicle("Audi", "A4", 2017);
        car.manufacture();
        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.displayInfo();

        System.out.println('\n');

        Vehicle motorcycle = motorcycleFactory.createVehicle("Honda", "Rebel1100", 2020);
        motorcycle.manufacture();
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.accelerate();
        motorcycle.displayInfo();
    }
}
