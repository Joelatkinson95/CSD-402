//Joel Atkinson Assignment 4.2 Java for Programmers CSD402 August 28, 2025
/*The purpose of this assignment is to write 4 overloaded methods that return the average of short, int, long, double
arrays. */

public class AverageCalculator {
    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {26, 42, 95,};
        int[] intArray = {4785547, 5769086, 6306723, 7389021};
        long[] longArray = {374859876, 564982341, 968462651, 116498365, 587625383};
        double[] doubleArray = {3.54, 9.23, 7.82, 4.74, 9.19, 8.98};

        System.out.println("Short array elements:");
        for (short num : shortArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));
        System.out.println();

        System.out.println("Int array elements:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(intArray));
        System.out.println();

        System.out.println("Long array Elements:");
        for (long num : longArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(longArray));
        System.out.println();

        System.out.println("Double array elements:");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
        System.out.println();
    }
}
