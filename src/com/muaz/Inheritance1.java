package com.muaz;


/**
 * @author Muaz Abdulhafiz
 * @date 06/11/2024
 * Demonstrates inheritance in Java with Car and SpecificCar classes.
 */


public class Inheritance1 {
    /**
     * Main method to demonstrate inheritance.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a SpecificCar object
        SpecificCar c = new SpecificCar("Muaz", "Civic");
        
        // Invoke methods of SpecificCar
        c.pressHorn(); // This will output "Beep beep."
        c.pressGas();  // This will output "Zoom zoom."

        // Print make and model of the car
        System.out.println(c.getMake());
        System.out.println(c.getModel());
    }
}

/**
 * Represents a generic Car.
 */
class Car {
    private String make;

    /**
     * Constructs a Car object with a specified make.
     * @param make The make of the car.
     */
    public Car(String make) {
        this.make = make;
    }

    /**
     * Makes the car horn sound.
     */
    public void pressHorn() {
        System.out.println("Honk honk.");
    }

    /**
     * Makes the car accelerate.
     */
    public void pressGas() {
        System.out.println("Zoom zoom.");
    }

    /**
     * Gets the make of the car.
     * @return The make of the car.
     */
    public String getMake() {
        return make;
    }
}

/**
 * Represents a SpecificCar, a subclass of Car.
 */
class SpecificCar extends Car {
    private String model;

    /**
     * Constructs a SpecificCar object with specified make and model.
     * @param make The make of the car.
     * @param model The model of the car.
     */
    public SpecificCar(String make, String model) {
        super(make);
        this.model = model;
    }

    /**
     * Overrides the pressHorn method to make a specific horn sound.
     */
    @Override
    public void pressHorn() {
        System.out.println("Beep beep.");
    }

    /**
     * Gets the model of the car.
     * @return The model of the car.
     */
    public String getModel() {
        return model;
    }
}