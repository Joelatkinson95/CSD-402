//Joel Atkinson September 11, 2025 Assignment 7.2 CSD 402 Java for Programmers
/*The purpose of this assignment is to create a collection of fan instances that display without using the toString()
method and use the "this" reference throughout the fan class. */

import java.util.ArrayList;

public class UseFans {
    private ArrayList<Fan> fans = new ArrayList<>();

    public void displayFans(ArrayList<Fan> fanList) {
        for (Fan fan : fanList) {
            System.out.println("Fan Details:");
            System.out.println("Speed: " + fan.getSpeed());
            System.out.println("Is On: " + fan.isFanOn());
            System.out.println("Radius: " + fan.getRadius());
            System.out.println("Color: " + fan.getColor());
            System.out.println("-----------------");
        }
    }

    public void displayFan(Fan fan) {
        System.out.println("Single Fan Details:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Is On: " + fan.isFanOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("----------------");
    }
}
