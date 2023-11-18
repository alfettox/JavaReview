public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        swapV1(a, b);
        swapV2(a, b);
    }


    public static void swapV1(int a, int b) {

        /*
        a = aa
        b = bbbb
        a = aabbbb
        b = aabbbb - aa = bbbb
        a = aabbbb - bbbb = aa
        */

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a + "\nb: " + b);
    }

    public static void swapV2(int a, int b) {
        a = a ^ b; //0101 ^ 0111 = 0010
        b = a ^ b; //0010 ^ 0111 = 0101
        a = a ^ b; //0010 ^ 0111 = 0111

        System.out.println("a: "+ a + "\nb: "+b);

    }
}
