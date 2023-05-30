package com.mycompany.abstractfactory;


public class Motorcycle implements Vehicle {

    private String manufacturer;
    private String model;
    private int year;
    private int speed;

    public Motorcycle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing a " + year + " " + manufacturer + " " + model + " motorcycle.");
    }

    @Override
    public void start() {
        System.out.println("Starting the " + year + " " + manufacturer + " " + model + " motorcycle.");
    }

    @Override
    public void accelerate() {
        speed += 5;
        System.out.println("Accelerating the " + year + " " + manufacturer + " " + model + " motorcycle. Current speed: " + speed);
    }

    @Override
    public void brake() {
        if (speed > 0) {
            speed -= 5;
        }
        System.out.println("Applying brakes to the " + year + " " + manufacturer + " " + model + " motorcycle. Current speed: " + speed);
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Current speed: " + speed);
    }
}
