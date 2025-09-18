//Joel Atkinson September 17,2025 CSD402 Java for Programmers Assignment 9.2
/*The purpose of this assignment is to create a program that create a file, check if it exists, if it doesn't make a new
file that adds 10 random numbers or appends 10 random numbers to previous file */

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.io.IOException;

public class RandomFileDemo {
    public static void main(String[] args) {
        Random random = new Random();

        try (FileWriter writer = new FileWriter("data.file", true)) {
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(101);
                writer.write(num + (i < 9 ? " " : ""));
            }
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("data.file"))) {
            String line;
            System.out.println("Contents of data.file");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        }

    }
}
