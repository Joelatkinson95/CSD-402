//Joel Atkinson, September 2, 2025, CSD402 Assignment 6.2 Test Class
//The purpose of this code is to test the output of the variables set up in the "Fan" class

public class TestFan {
    public static void main(String[] args) {
        // Create first fan with default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan (initial): " + defaultFan.toString());

        // Create second fan with argument constructor
        Fan customFan = new Fan(2, true, 8, "black"); // MEDIUM, on, radius 8, black
        System.out.println("Custom Fan (initial): " + customFan.toString());

        // Test setters to change defaultFan
        defaultFan.setSpeed(3); // Change speed to FAST
        defaultFan.setFanOn(true); // Turn it on
        defaultFan.setRadius(7); // Change radius to 7
        defaultFan.setColor("green"); // Change color to green
        System.out.println("Default Fan (after changes): " + defaultFan.toString());

        // Test getters to check customFan
        System.out.println("Custom Fan speed: " + customFan.getSpeed()); // Should be 2
        System.out.println("Custom Fan isOn: " + customFan.isFanOn()); // Should be true
        System.out.println("Custom Fan radius: " + customFan.getRadius()); // Should be 8
        System.out.println("Custom Fan color: " + customFan.getColor()); // Should be "black"
    }
}