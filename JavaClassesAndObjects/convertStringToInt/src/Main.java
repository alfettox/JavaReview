public class Main {
    public static void main(String[] args) {
        String str = "1234";

        System.out.println(converter(str));
    }

    private static int converter(String str) {
        int result = 0;
        int ind = 0;

        while (ind < str.length()) {
            char c = str.charAt(ind);

            if (Character.isDigit(c)) {
                int curr = c - '0';         //ASCII value of zero
                result = result * 10 + curr;
                ind++;
            }
        }

        return result;
    }
}
