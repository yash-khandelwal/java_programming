package com.company;

public class Car {
//    properties
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
//    validators
    public boolean validateDoors(int doors) {
        return (doors >= 1 && doors <= 8);
    }
    public boolean validateWheels(int wheels) {
        return (wheels % 2 == 0 && (wheels > 0 && wheels <= 16));
    }
//    modifiers
    public void setDoors(int doors) {
        if(validateDoors(doors)) {
            this.doors = doors;
            System.out.println("setDoors success");
        } else {
            System.out.println("setDoors failed, invalid doors");
        }
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setColor(String color) {
        this.color = color;
    }
//    access
    public int getDoors() {
        return this.doors;
    }
    public int getWheels() {
        return this.wheels;
    }
    public String getModel() {
        return this.model;
    }
    public String getEngine() {
        return this.engine;
    }
    public String getColor() {
        return this.color;
    }
//    print the Object
    public void print() {
        System.out.println("Doors: " + this.doors);
        System.out.println("Wheels: " + this.wheels);
        System.out.println("Model: " + this.model);
        System.out.println("Engine: " + this.engine);
        System.out.println("Color: " + this.color);
    }
}
