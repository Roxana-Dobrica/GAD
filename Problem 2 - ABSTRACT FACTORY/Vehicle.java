package com.mycompany.abstractfactory;


interface Vehicle {

    void manufacture();

    void start();

    void accelerate();

    void brake();

    String getManufacturer();

    String getModel();

    int getYear();

    int getSpeed();

    void setManufacturer(String manufacturer);

    void setModel(String model);

    void setSpeed(int speed);

    void setYear(int year);

    void displayInfo();
}
