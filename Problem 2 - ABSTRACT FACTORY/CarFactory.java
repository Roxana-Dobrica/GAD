package com.mycompany.abstractfactory;


public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle(String manufacturer, String model, int year) {
        return new Car(manufacturer, model, year);
    }
}
