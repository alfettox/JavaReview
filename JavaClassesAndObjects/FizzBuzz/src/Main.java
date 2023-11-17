public class Main {
    public static void main(String[] args) {
        //WRAPPER CLASS

        // %3 Fizz %5 Buzz 3% AND 5% FizzBuzz   1 -> 100

        for (int i = 1; i <= 100; i++) {
            if(i%3==0 && i%5 == 0 ){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            } else if(i%5 ==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}