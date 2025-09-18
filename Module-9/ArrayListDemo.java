//Joel Atkinson, September 17, 2025 CSD402 Java for Programmers Assignment 9.2 Program #1
/* The purpose of this assignment is to write a program that uses ArrayList with minimum 10 strings that prints the list
and then prompts user for which element they would like to see again. Then attempting to print the element in a try/catch
format which will results in the element being displayed */

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NumberFormatException;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        items.add("New York, NY (0)");
        items.add("Los Angeles, CA (1)");
        items.add("Chicago, IL (2)");
        items.add("Phoenix, AZ (3)");
        items.add("Houston, TX (4)");
        items.add("Miami, FL (5)");
        items.add("San Francisco, CA (6)");
        items.add("Seattle, WA (7)");
        items.add("Philadelphia ,PA (8)");
        items.add("Boston, MA (9)");
        items.add("Detroit, MI (10)");
        items.add("Washington, DC (11)");
        items.add("New Orleans, LA (12)");
        items.add("Las Vegas, NV (13)");
        items.add("Denver, CO (14)");
        items.add("Atlanta, GA (15)");
        items.add("Portland, OR (16)");
        items.add("Dallas, TX (17)");
        items.add("Columbus, OH (18)");
        items.add("Tampa, FL (19)");

        System.out.println("List of some Major U.S. Cities");
        System.out.println();
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println();

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Enter the index (bracketed number) that you would like to see again: ");
            String userIndexStr = scanner.nextLine();

            try {
                Integer indexObj = Integer.valueOf(userIndexStr);
                int index = indexObj.intValue();

                try {
                    String selectedItem = items.get(index);
                    System.out.println("The city at index " + index + " is: " + selectedItem);
                    System.out.println("Would you like to view another index? (yes/no)");
                    String response = scanner.nextLine().trim().toLowerCase();
                    if (response.equals("no")) {
                        continueProgram = false;
                        System.out.println("Goodbye!");
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Out of Bounds");
                }
            } catch (NumberFormatException e) {
                System.out.println("Out of Bounds");
            }
        }
        scanner.close();
    }
}
