package com.scott;

/**
 * THis is the object for the Car
 */

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        Car chevy = new Car();
        Car color = new Car();

        porsche.setModel("carrera");
        chevy.setModel("Chevy");
        holden.setModel("Equinox");

        System.out.println("Model is " + porsche.getModel());
    }
}
