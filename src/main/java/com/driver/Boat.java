package com.driver;

public  class Boat implements WaterVehicle{
    String name;
    int capacity;

    public  Boat(String name, int capacity){
        this.name=name;
        this.capacity=capacity;
    }

    public String getVehicleName() {
        return name;
    }
    public void setVehicleName(String name) {
        this.name = name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
    public void setVehicleCapacity(int capacity) {
        this.capacity = capacity;
    }
}
