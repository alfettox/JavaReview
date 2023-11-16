public class Main {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49};
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100};

        int[] combined = new int[firstHalf.length + secondHalf.length];

        System.arraycopy(firstHalf, 0, combined, 0, firstHalf.length);

        System.arraycopy(secondHalf, 0, combined, firstHalf.length, secondHalf.length);

        for (int value : combined) {
            System.out.print(value + " ");
        }
    }
}
