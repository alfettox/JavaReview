import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int playerCash = 0;

        System.out.println("How many dollars you want to bet?");
        playerCash = scanner.nextInt();
        int maxCash = playerCash;
        int cycle = 0;

        int diceRoll1;
        int diceRoll2;
        int sum;
        while (true) {
            System.out.print("Round: " + cycle + " | ");
            diceRoll1 = random.nextInt(6) + 1;
            diceRoll2 = random.nextInt(6) + 1;
            sum = diceRoll1 + diceRoll2;

            if (sum == 7) {
                playerCash += 4;
                System.out.print("You earned 4$ ");
            } else {
                playerCash -= 1;
                System.out.print("You lose 1$ ");
            }
            System.out.print("| Cash: " + playerCash + "$\n");

            cycle++;

            if (playerCash > maxCash) {
                maxCash = playerCash;
            }

            if (playerCash <= 0) {
                break;
            }
        }
        System.out.println("You loose after: " + cycle + " rounds");
    }
}