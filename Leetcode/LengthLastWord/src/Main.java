public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Length last word: " + lengthLastWord(s));

    }

    private static int lengthLastWord(String s) {
        int l=0;
        String[] strings = s.split(" ");
        return strings[strings.length-1].length();

    }
}