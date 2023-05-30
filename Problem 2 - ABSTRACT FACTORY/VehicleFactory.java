package com.mycompany.abstractfactory;


interface VehicleFactory {

    Vehicle createVehicle(String manufacturer, String model, int year);
}
