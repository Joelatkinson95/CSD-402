//Joel Atkinson, September 2, 2025, CSD402 Assignment 6.2
/* The purpose of this assignment is to create a fan class with constants, mutable fields, setters and getters, as well
as No-Argument and Argument constructors. Then build a test class to test the variables are output correctly */


public class Fan {
    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private mutable fields with defaults
    private int speed = STOPPED;
    private boolean fanOn = false;
    private int radius = 6;
    private String color = "white";

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(int newSpeed) {
        if (newSpeed == STOPPED || newSpeed == LOW || newSpeed == MEDIUM || newSpeed == FAST) {
            this.speed = newSpeed;
        } else {
            System.out.println("Invalid Speed! Please enter STOPPED, LOW, MEDIUM, or FAST");
        }
    }

    // Getter for fanOn
    public boolean isFanOn() {
            return fanOn;
        }

        // Setter for fanOn
    public void setFanOn(boolean newFanOn) {
        this.fanOn = newFanOn;
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int newRadius) {
        if (newRadius > 0) {
            this.radius = newRadius;
        } else {
            System.out.println("Radius must be a positive int");
        }
    }

    // Setter for color
    public String getColor() {
        return color;
    }

    // Getter for color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.fanOn = false;
        this.radius = 6;
        this.color = "white";

    }

    // Argument constructor
    public Fan(int speed, boolean fanOn, int radius, String color) {
        this.speed = speed;
        this.fanOn = fanOn;
        if (radius> 0) {
            this.radius = radius;
        } else {
            this.radius = 6;
            System.out.println("Radius must be a positive, set to default of 6");
        }
        this.color = color;
    }

    // toString Method
    public String toString() {
        return "Fan: Speed " + speed + ", fanOn " + fanOn + ", radius " + radius + ", color " + color;
    }

}



