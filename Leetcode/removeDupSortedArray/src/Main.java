import java.util.HashSet;
import java.util.Set;

/**
 * Return number of unique elements
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDupSortedArray(nums));
        System.out.println(removeDupSortedArray(nums2));
        System.out.println(removeDupSortedArrayVer2(nums2));
    }

    private static int removeDupSortedArrayVer2(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }

        }
        return k+1; //length
    }

    private static int removeDupSortedArray(int[] nums) {
        int counter = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer n : nums) {
            if (!set.add(n)) {
                counter++;
            }
        }
        return counter;
    }
}