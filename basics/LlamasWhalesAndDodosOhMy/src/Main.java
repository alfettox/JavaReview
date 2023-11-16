import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dodos.run();
        KnockKnock.run();
    }

    private static class Dodos {
        private static void run() {
            int llamas = 20;
            int whales = 15;
            int dodos = 3;

            if (dodos < 0) {
                System.out.println("Impossible dodos value. It's negative");
            } else if (dodos == 0) {
                System.out.println("Dodos are extincts");
            } else if (dodos > 0 && dodos < 10) {
                System.out.println("Dodos are not extinct! But there are few of them");
            } else {
                System.out.println("There are many of them");
            }
        }
    }


    private static class KnockKnock {
        private static void run() throws InterruptedException {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Knock Knock! Guess who?!");
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.print(".");
                    Thread.sleep(1000);
                }

            } catch( Exception e){
                System.out.println(e);
            }

            String nameGuess = scanner.nextLine();

            if (nameGuess.equals("Marty McFly")) {
                System.out.println("Hey! That's right! I'm back");
                System.out.println("....from the future!!!!!!!!");
            } else {
                System.out.println("Dude, do I look like " + nameGuess + "?");
            }
        }
    }
}