//Joel Atkinson September 16,2025 CSD402 Java for Programmers Assignment 8.2
/*The purpose of this assignment is to prompt user to enter series of integers, test to ensure it is not empty,
then display the largest integer after the user enters "0" to end the program. */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JoelArrayListTest {
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        int largest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter integers one by one. Enter 0 to stop: ");

            try {
                int firstInput = scanner.nextInt();
                numbers.add(firstInput);
                if (firstInput == 0) {
                    while (true) {
                        System.out.println("The list is empty! Would you like to exit? (yes/no)");
                        String response = scanner.next().toLowerCase();
                        if (response.equals("yes")) {
                            ArrayList<Integer> emptyList = new ArrayList<>();
                            System.out.println("Test empty list: " + max(emptyList));
                            System.out.println("Goodbye!");
                            break;
                        } else if (response.equals("no")) {
                            System.out.println("Enter integers one by one. Enter 0 to stop: ");
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                            scanner.next();
                        }
                    }

                }

                while (true) {
                    try {
                        int input = scanner.nextInt();
                        numbers.add(input);
                        if (input == 0) {
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid integer!");
                        scanner.next();
                    }
                }

                if (numbers.size() == 1 && numbers.get(0) == 0) {
                    System.out.println("The list is empty! Please enter integers in order to check for largest value");
                    numbers.clear();
                    continue;
                }


                Integer largestNumber = max(numbers);
                System.out.println("The largest value is: " + largestNumber);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer!");
                scanner.next();
                continue;
            }
        }

        scanner.close();

    }
}
