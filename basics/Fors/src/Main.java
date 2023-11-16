public class Main {
    public static void main(String[] args) {

        ForIt.run();
        ForIt2.run();

        ForItJump.run();

        WhileEven.run();

        NestedLoop.run();
    }

    private static class ForIt {
        private static void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }


    private static class ForIt2 {
        private static void run() {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }

    private static class ForItJump {
        private static void run() {
            for (int i = 10; i <= 50; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static class WhileEven {
        private static void run() {
            int num = 1;


            while (num < 15) {
                if (num%2==0){
                    System.out.println(num);
                }
                num++;
            }
        }
    }

    private static class NestedLoop {
        private static void run(){
            for(int i = 0; i< 10; i++){
                for(int j = i; j<10; j++){
                    System.out.print("i");
                }
                System.out.println("e");
            }
        }
    }
}

