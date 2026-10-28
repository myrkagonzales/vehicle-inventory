package com.pluralsight;

public class Vehicle {

    // unique id for each vehicle
    private int vehicleId;
    // vehicle make and model
    private String makeModel;
    // vehicle color
    private String color;
    // current mileage on the vehicle
    private int odometerReading;
    // vehicle price
    private double price;

    // constructor used when creating a new vehicle object
    public Vehicle(int vehicleId,
                   String makeModel,
                   String color,
                   int odometerReading,
                   double price)
    {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
