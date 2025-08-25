// Joel Atkinson August 21, 2025
// CSD 402 Java for Programmers
// Purpose of this assignment is to create a system using random generation that plays rock, paper, scissors with user


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playAgain = 0;

        do {

            Random random = new Random();
            int computerChoice = random.nextInt(3) + 1;

            System.out.print("Please enter the number that reflects your choice. 1 (Rock), 2 (Paper), or 3 (Scissors): ");
            int userChoice = scanner.nextInt();

            String computerPick = (computerChoice == 1) ? "Rock" : (computerChoice == 2) ? "Paper" : "Scissors";
            String userPick = (userChoice == 1) ? "Rock" : (userChoice == 2) ? "Paper" : "Scissors";

            String result;
            if (computerChoice == userChoice) {
                result = "It's a tie! Please play again.";
            } else if ((computerChoice == 1 && userChoice == 3) ||
                    (computerChoice == 2 && userChoice == 1) ||
                    (computerChoice == 3 && userChoice == 2)) {
                result = "You lost this round. Please play again!";
            } else {
                result = "Congratulations, You won!";
            }

            System.out.println("Computer chose: " + computerPick);
            System.out.println("You chose: " + userPick);
            System.out.println("Result: " + result);

            boolean validInput = false;
            while (!validInput) {
                System.out.print("Would you like to play again? (1 = Yes, 2 = No): ");
                if (scanner.hasNextInt()) {
                    playAgain = scanner.nextInt();
                    if (playAgain == 1 || playAgain == 2) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid entry. Please enter 1 to play again or 2 to exit");
                    }
                } else {
                    System.out.println("Invalid entry. Please enter 1 to play again or 2 to exit");
                    scanner.next();
                }
            }

        } while (playAgain == 1);

        scanner.close();
        System.out.println("Thanks for playing!");

    }
}
