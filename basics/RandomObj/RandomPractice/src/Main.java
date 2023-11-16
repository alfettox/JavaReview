import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();


        System.out.println("Random can make integers: " + rand.nextInt());
        System.out.println("Or a double: " + rand.nextDouble());
        System.out.println("Or even a boolean: " + rand.nextBoolean());

        int num = rand.nextInt();

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.println(rand.nextInt(101));
        System.out.println(rand.nextInt(101));
        System.out.println(rand.nextInt(101));
        System.out.println(rand.nextInt(101));

        System.out.println("This is a random boolean value: " + rand.nextBoolean());
    }
}