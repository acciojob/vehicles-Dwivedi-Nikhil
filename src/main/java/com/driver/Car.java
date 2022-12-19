package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        //Hint: Car extends Vehicle

        //this.type=name;
        this.wheels=wheels;
        this.seats=seats;
        this.doors=doors;
        this.type=type;
        this.gears =gears;
        this.currentGear=1;
        this.isManual=isManual;
    }

    //no idea about getter function....added as told by someone
    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public void changeGear(int newGear){
       // newGear=currentGear; // Set currGear to new gear krna tha...ulta kiya tune
        currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
