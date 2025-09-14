//Joel Atkinson, September 11, 2025, CSD402 Assignment 6.2 Test Class
/*The purpose of this code is to test the output of the variables set up in the "Fan" class without using the toString()
method. This is my updated TestFan code to follow assignment 7.2 instructions */

import java.util.ArrayList;
public class TestFan {
    public static void main(String[] args) {
        // Create an instance of UseFans
        UseFans useFans = new UseFans();

        // Create a collection of Fan instances
        ArrayList<Fan> fanCollection = new ArrayList<>();
        fanCollection.add(new Fan()); // Default fan
        fanCollection.add(new Fan(3, true, 10, "blue")); // Custom fan
        fanCollection.add(new Fan(1, false, 5, "red")); // Another custom fan

        // Display the collection
        System.out.println("Displaying all fans in the collection:");
        useFans.displayFans(fanCollection);

        // Display a single fan
        System.out.println("Displaying a single fan:");
        useFans.displayFan(fanCollection.get(0)); // Display the first fan

        // Modify a fan and display again
        Fan firstFan = fanCollection.get(0);
        firstFan.setSpeed(2); // Change speed to MEDIUM
        firstFan.setFanOn(true); // Turn it on
        firstFan.setRadius(8); // Change radius
        firstFan.setColor("green"); // Change color
        System.out.println("Displaying modified first fan:");
        useFans.displayFan(firstFan);
    }
}