// Joel Atkinson CSD402 Assignment 3.2
// This assignment's purpose is to use nested loops to display numbers mirroring each other in a pyramid output

public class NestedLoop {
    public static void main(String[] args) {
        int rows = 7;
        int maxWidth = 33;
        for (int row = 1; row <= rows; row++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < row; j++) {
                int num = 1 << j;
                if (line. length() > 0) {
                    line.append(" ");
                }
                line.append(num);
            }
            for (int j  = row - 2; j >= 0; j--) {
                int num = 1 << j;
                line.append(" ");
                line.append(num);
            }
            String numbersStr = line.toString();
            int currentWidth = numbersStr.length() + 2;
            int leadingSpaces = (maxWidth - currentWidth) / 2;
            for (int s = 0; s < leadingSpaces; s++) {
                System.out.print(" ");
            }
            System.out.print(numbersStr);

            for (int s = currentWidth + leadingSpaces; s < maxWidth -1; s++) {
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();
        }
    }
}
