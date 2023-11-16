import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] res = factorial(n);

        System.out.println("Factorial(" + n + ") = " +
                Arrays.toString(res) + " => " + res[res.length-1]);
    }

    private static int[] factorial(int n) {
        int[] arr = new int[n + 1];
        factorialRec(n, arr);
        return arr;
    }

    private static int factorialRec(int i, int[] arr) {
        if (i <= 1) {
            arr[i] = 1;
            return 1;
        }
        arr[i] = i * factorialRec(i - 1, arr);
        return arr[i];
    }
}
