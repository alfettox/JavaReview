import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterestCalculator.run();

    }

    private static class InterestCalculator {
        private static void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insert the amount of money to be invested");
            double principal = scanner.nextDouble();
            System.out.println("How many years");
            int years = scanner.nextInt();
            System.out.println("What is the annual interest? x/100");
            double annualInterestRate = scanner.nextDouble();

            int compoundedTimesByYear = 4;
            double quarterlyInterestRate = annualInterestRate / compoundedTimesByYear / 100;

            for (int year = 1; year <= years; year++) {
                double interestEarned = principal * quarterlyInterestRate;
                principal += interestEarned;


                System.out.println("Year " + year + ":");
                System.out.printf("Began with $%.2f\n", principal - interestEarned);
                System.out.printf("Earned $%.2f\n", interestEarned);
                System.out.printf("Ended with $%.2f\n\n", principal);
            }
            scanner.close();
        }

    }
}