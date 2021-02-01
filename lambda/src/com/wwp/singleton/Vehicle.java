package com.wwp.singleton;

public class Vehicle {
    private String id;
    private String vehicleName;
    private String vehicleCode;
    private String brand;

    public Vehicle() {
        System.out.println("========");
    }

    public Vehicle(String id, String vehicleName, String vehicleCode, String brand) {
        this.id = id;
        this.vehicleName = vehicleName;
        this.vehicleCode = vehicleCode;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
