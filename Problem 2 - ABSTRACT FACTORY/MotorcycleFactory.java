package com.mycompany.abstractfactory;


public class MotorcycleFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle(String manufacturer, String model, int year) {
        return new Motorcycle(manufacturer, model, year);
    }
}
