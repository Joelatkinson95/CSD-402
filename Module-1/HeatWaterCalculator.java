// Joel Atkinson, August 15,2025, Java for Programmers Assignment 1.2
/*
* The purpose of this assignment is to gather user input for an amount of water in KG, the initial temp of the water,
* and desired temp of the water, then calculate the amount of energy needed in Joules to heat the water to desired temp
*/


import java.util.Scanner;

public class HeatWaterCalculator {
    public static void main(String[] args) {
        //Create a Scanner object to read the user input
        Scanner scanner = new Scanner(System.in);

        //Prompt the user for water mass in kg
        System.out.print("Enter the amount of water to be heated in kilograms: ");
        double waterMass = scanner.nextDouble();

        //Prompt the user for initial temperature in Celsius
        System.out.print("Enter the initial water temperature in Celsius: ");
        double initialTemp = scanner.nextDouble();

        // Prompt user for final temperature in Celsius
        System.out.print("Enter final water temperature in Celsius: ");
        double finalTemp = scanner.nextDouble();

        // Calculate the energy using formula Q = waterMass * (finalTemp - initialTemp) * 4184
        double energy = waterMass * (finalTemp - initialTemp) * 4184;

        // Display the result
        System.out.println("The energy needed to heat the water to your desired temperature is " + energy + " Joules.");

        // Close the Scanner
        scanner.close();
    }
}
