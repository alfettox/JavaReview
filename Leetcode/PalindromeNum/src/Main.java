public class Main {
    public static void main(String[] args) {
        int x = 121;
        int x2 = -121;
        int x3 = 10;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(x2));
        System.out.println(isPalindrome(x3));

        System.out.println(isPalindromeOpt(x));
        System.out.println(isPalindromeOpt(x2));
        System.out.println(isPalindromeOpt(x3));
    }

    private static boolean isPalindromeOpt(int x) {
            int original = x;
            int reversed = 0;
            int digit;
            while(x>0){
                digit = x % 10;
                reversed = reversed *10 +digit;
                x /= 10;
            }
            if(original == reversed)
                return true;

        return false;
    }

    private static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}