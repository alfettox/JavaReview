import java.util.Random;
import java.util.Scanner;


/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

//        IfStatementPractice.run();
//        SwitchStatement.run();
        BitWiseOperators.run();
        RandomClass.run();
        DoWhile.run();


    }

    private static class IfStatementPractice {
        private static void run() {
            System.out.println("Enter your age");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();

            if (age < 13) {
                System.out.println("You are very young");
            } else if (age < 18) {
                System.out.println("Your are a teenager");
            } else {
                System.out.println("You are an adult");
            }
        }
    }

    private static class SwitchStatement {
        private static void run() {
            int target = 10;
            int pointer = 0;
            while (pointer <= 10) {
                System.out.print(pointer + " > ");
                pointer++;
            }
        }
    }

    private static class BitWiseOperators {

        private static void run() {
            int a = 2;
            int b = 4;

            int resultAND = a & b;
            int resultOR = a | b;
            int resultXOR = a ^ b;
            int resultNOT = ~a;
            int resultLeftShift = a << 2;
            int resultRightShift = a >> 2;
            int unsignedRightShift = a >>> 2;
            int unsignedLeftShift = a << 2;


            System.out.println("ResultAND = a & b " + resultAND);
            System.out.println("ResultOR = a | b " + resultOR);
            System.out.println("ResultXOR = a ^ b " + resultXOR);
            System.out.println("ResultNOT = ~a " + resultNOT);
            System.out.println("ResultLeftShift = a << " + resultLeftShift);
            System.out.println("ResultRightShift = a >> " + resultRightShift);
            System.out.println("unsignedRightShift = a >>> " + resultRightShift);
            System.out.println("unsignedLeftShift = a << " + resultLeftShift);


        }
    }

    private static class RandomClass {
        private static void run() {
            Random random = new Random();
            System.out.println(random.nextInt(10));
            System.out.println(random.nextInt(10) + 1);
        }
    }

    private static class DoWhile {
        private static void run() {
            int start = 0;
            int end = 10;
            int curr = start;

            do {
                System.out.println(curr);
                curr++;
            } while (
                    curr < end
            );
        }

    }
}
