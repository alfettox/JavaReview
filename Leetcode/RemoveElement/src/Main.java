import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElem(nums, val));
    }

    private static int removeElem(int[] nums, int val) {
        int nonEqualCount = 0;
        int writeIndex = 0;

        for (int i : nums) {
            if (i != val) {
                nums[writeIndex] = i;
                nonEqualCount++;
                writeIndex++;
            }
        }

         System.out.println(Arrays.toString((nums)));

        return nonEqualCount;
    }
}
