package com.scott;

/** Created
 * by Scott Fenech
 */

public class Car {

    public int doors;
    public int wheels;
    private String model;
    public String engine;
    public String color;

    public void setModel (String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera")|| validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }
}
