import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//       Exercise1.run(scanner);
        MadLib.run(scanner);

    }

    private static class Exercise1 {
        private static void run(Scanner scanner) {
            String name;
            String yourQuest;
            double speed;


            System.out.println("Please insert your name");
            name = scanner.nextLine();

            System.out.println("What is your quest?");
            yourQuest = scanner.nextLine();

            System.out.println("What is your speed?");
            speed = Double.parseDouble(scanner.nextLine());


            System.out.printf("Your name is %s, your quest is %s, your moving speed is %.2f", name, yourQuest, speed);

            scanner.close();
        }
    }

    private static class MadLib {
        private static void run(Scanner scanner) {
            String noun;
            String adjective;
            double number;
            String nounB;


            System.out.println("I need a noun: ");
            noun = scanner.nextLine();
            System.out.println("Now an adjective: ");
            adjective = scanner.nextLine();
            System.out.println("Another noun: ");
            nounB = scanner.nextLine();
            System.out.println("And a number: ");
            number = scanner.nextDouble();

            System.out.println("MAD TEXT:");
            System.out.printf("%s: the %s frontier." +
                    "These are the voyages of the starship %s." +
                    "This starship is travelling since %f", noun, adjective, nounB, number);

        }
    }
}
