import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main solution = new Main();

        int[] nums1 = {1, 2, 3};
        System.out.println(solution.subsets(nums1));

        int[] nums2 = {0};
        System.out.println(solution.subsets(nums2));
    }

    public List<List<Integer>> subsets(int[] nums) {
        // To make all duplicates together
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        // Call the subset creation method
        subsetCreation(0, nums, res, list);
        // Return
        return res;
    }

    public void subsetCreation(int index, int[] arr, List<List<Integer>> res, List<Integer> list) {
        res.add(new ArrayList<>(list));
        for (int i = index; i < arr.length; i++) {
            if (i != index && arr[i] == arr[i - 1]) continue;
            list.add(arr[i]);
            subsetCreation(i + 1, arr, res, list);
            list.remove(list.size() - 1);
        }
    }
}