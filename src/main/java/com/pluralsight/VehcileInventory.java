package com.pluralsight;

public class VehcileInventory {

    public static void main(String[] args) {

        // create vehicle objects
        Vehicle vehicle1 = new Vehicle(101, "Porshe 911 gt3", "Shark Blue", 5000, 189999.99);
        Vehicle vehicle2 = new Vehicle( 102, "Volkswagen Beetle","Black", 72000, 10999.99);
        Vehicle vehicle3 = new Vehicle(103, "Jaguar F-Pace","White", 31000, 42999.99);
        Vehicle vehicle4 = new Vehicle(104, "Ford Bronco Badlands","Cactus Gray", 6500, 59999.99);
        Vehicle vehicle5 = new Vehicle(105, "Dodge Challenger Hellcat", "Plum Crazy Purple", 15000, 59999.99);
        Vehicle vehicle6 = new Vehicle(106, "Rivian R1T", "Forrest Green", 8000, 74999.99);

        // store all vehicle objects inside an array
        Vehicle[] inventory = {
                vehicle1,
                vehicle2,
                vehicle3,
                vehicle4,
                vehicle5,
                vehicle6
        };
        // loop through every vehicle in the inventory array
        for (Vehicle vehicle : inventory) {
            // display vehicle information using getters
            System.out.println("Vehicle Id: " + vehicle.getVehicleId());
            System.out.println("Make/Model: " + vehicle.getMakeModel());
            System.out.println("Color: " + vehicle.getColor());
            System.out.println("Mileage: " + vehicle.getOdometerReading());
            System.out.println("Price: $" + vehicle.getPrice());


            // generate a separator to make output easier to read
            System.out.println("------------------------------");
        }
    }
}
