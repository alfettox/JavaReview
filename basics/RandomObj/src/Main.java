import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Exercise1.run();
//        Exercise2.run();
//        Exercise3.run();
            Exercise4ShiftedRange.run();
    }

    private static class Exercise1 {
        private static void run() {
            Random random = new Random();
            Random fixedSeed = new Random(1121365);
            Random timedSeed = new Random();

            int i;
            for (i = 0; i < 10; i++) {
                System.out.print(random.nextInt() + "   |  ");
                System.out.print(fixedSeed.nextInt() + "   |  ");
                System.out.print(timedSeed.nextInt() + "\n");
            }
        }
    }

    private static class Exercise2 {
        private static void run() {
            Random random = new Random();

            String[] names = new String[]{"Mario", "Emma", "Lori"};

            System.out.println("The random name is: " + names[random.nextInt(names.length)]);

        }
    }

    private static class Exercise3 {
        private static void run(){
            Random random = new Random();

            double probability = Math.floor(random.nextDouble()*101); // 0 - 100
            System.out.println(probability + "%");
        }
    }

    private static class Exercise4ShiftedRange {
        private static void run(){
            Random random = new Random();

            double rnd = random.nextDouble();

            double shiftedRnd = rnd * (13.2 - -7.5) + -7.5;

            double result = Math.floor(shiftedRnd * 100) / 100.0;
            System.out.println(result);
        }
    }
}