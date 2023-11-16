public class Main {
    public static void main(String[] args) throws InterruptedException {

        int time = 5;
        int bedTime = 22;

        try {
            while (time < bedTime) {
                System.out.println("It's only " + time + "o'clock");
                System.out.println("I think I'll stay up longer");
                time++;
                Thread.sleep(400);
            }
        } catch (Exception e){
            e.getCause();
        }

        System.out.println("It's " + time + " o'clock");
        System.out.println("Time to go to bed!");
    }
}