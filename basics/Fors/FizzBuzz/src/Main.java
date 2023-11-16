public class Main {
    public static void main(String[] args) {
        System.out.println("How many units of fizzing and buzzing do you need in your life? 7\n");
        for(int i =0; i<= 15; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            } else if(i%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);

            }
        }
        System.out.println("TRADITION!!!!!");
    }
}