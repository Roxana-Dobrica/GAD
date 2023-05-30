package com.mycompany.abstractfactory;


public class Car implements Vehicle {

    private String manufacturer;
    private String model;
    private int year;
    private int speed;

    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing a " + year + " " + manufacturer + " " + model + " car.");
    }

    @Override
    public void start() {
        System.out.println("Starting the " + year + " " + manufacturer + " " + model + " car.");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println("Accelerating the " + year + " " + manufacturer + " " + model + " car. Current speed: " + speed);
    }

    @Override
    public void brake() {
        if (speed > 0) {
            speed -= 10;
        }
        System.out.println("Applying brakes to the " + year + " " + manufacturer + " " + model + " car. Current speed: " + speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Current speed: " + speed);
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
    public int getYear() {
        return year;
    }

    @Override
    public int getSpeed() {
        return speed;
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
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" + "manufacturer=" + manufacturer + ", model=" + model + ", year=" + year + ", speed=" + speed + '}';
    }

}
