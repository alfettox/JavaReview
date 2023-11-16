public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Exercise1.run();
        Exercise2.run();
        AllTheMaths.run();
        InABucket.run();
        MoreBucketsForFun.run();
        TheOrderOfThings.something();
        AllAboutMe.resume();
        MenuOfChmapions.run();
        BestAddedEver.run();

    }

    private static class Exercise1 {
        private static void run() {
            System.out.println("This is Exercise 1 in an inner class");
        }

    }
    private static class Exercise2 {
        private static void run() {
            System.out.println("This is Exercise 2 in an inner class");
        }
    }
    private static class AllTheMaths {
        private static void run() {
            System.out.print("1 + 2 is: ");
            System.out.println(1 + 2);

            System.out.print("5562.0 divided by 22.0 is: ");
            System.out.println(5562.0 / 22.0);


            System.out.print("Is 4 greater than -5? ");
            System.out.println(4 < 5);

            System.out.print("44 minus 22 plus 11 minus 66 minus 88 plus 76 minus 11 minus 33 : ");
            System.out.println(44 - 22 + 11 - 66 + 88 + 76 - 11 - 33);

            System.out.print("Is 67 greater than 9 * 9? ");
            System.out.println(67 > (9 * 9));
        }
    }
    private static class InABucket {
        private static void run() {
            String walrus;
            double piesEaten;
            float weightOfTeacupPig;
            int grainOfSand;

            walrus = "Sir Leroy Mark III, ";
            piesEaten = 42.1;

            System.out.println("Meet my pet walrus, " + walrus);
            System.out.print("He was a bit hungry today, and ate this many pies : ");

            System.out.println(piesEaten);
        }
    }
    private static class MoreBucketsForFun {
        private static void run() {
            int butterflies, beetles, bugs;

            butterflies = 5;
            beetles = 7;
            bugs = butterflies + beetles;
            System.out.println("There are only " + butterflies + " butterflies, ");
            System.out.println("but there are " + bugs + " bugs in all.");
            System.out.println("Uh on, my dog ate one. ");
            butterflies--;
            System.out.println("Now there are only " + butterflies + " butterflies left.");
            System.out.println("But there are still " + bugs + " bugs left.. ");
            System.out.println("Wait a minute!");
            System.out.println("..maybe my computer can't do math, after all");
        }
    }
    private static class TheOrderOfThings {
        private static void something() {
            double number;
            String opinion, size, age, shape, color, origin, material, purpose;
            String noun;

            number = 5.0;
            opinion = "good";
            size = "teensy-weensy";
            age = "old";
            shape = "rectangular";
            color = "yellow";
            origin = "Martian";
            material = "platinum";
            purpose = "good";
            noun = "cat";

            System.out.println(
                    number + "\n" +
                            opinion + "\n" +
                            size + "\n" +
                            age + "\n" +
                            shape + "\n" +
                            color + "\n" +
                            origin + "\n" +
                            material + "\n" +
                            purpose + "\n" +
                            noun
            );
        }
    }
    private static class AllAboutMe {
        private static void resume() {
            String name;
            String favFood;
            int numPets;
            String livingPlace;
            Boolean whistler;

            name = "Giovanni";
            favFood = "Pizza";
            numPets = 5;
            livingPlace = "apartment";
            whistler = true;

            System.out.printf("My name is %s," +
                    "my favorite food is %s, I have %d pets," +
                    "I live in an %s and It's %b," +
                    "I'm able to whistle", name, favFood, numPets, livingPlace, whistler);
        }
    }
    private static class MenuOfChmapions {
        private static void run() {
            double pizzaPrice = 15.00;
            double saladPrice = 12.00;
            double steakPrice = 16.00;
            System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n");
            System.out.println("            WELCOME TO RESTAURANT NIGHT VALE!\n");
            System.out.println("            Today's Menu Is...\n");
            System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n");

            System.out.println(" $ " + pizzaPrice + " ** Slice of pizza margherita");
            System.out.println(" $ " + saladPrice + " ** Caesar salad");
            System.out.println(" $ " + steakPrice + " ** Grilled steak");
        }
    }
    private static class BestAddedEver {
        private static void run(){
            int num1;
            int num2;
            int num3;

            num1= 3;
            num2=4;
            num3=7;

            int sum = num1+num2+num3;

            System.out.println(num1 +"+"+ num2 +"+"+ num3 + "="+sum);

        }
    }



}