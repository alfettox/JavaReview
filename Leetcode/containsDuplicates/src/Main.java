import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(contDup(nums));
        System.out.println(contDupSet(nums));


    }

    private static boolean contDupSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer n : nums)
        {
            if(!set.add(n))
                return true;
        }
        return false;
    }

    private static boolean contDup(int[] nums) {
        Map<Integer, Integer> fMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            fMap.put(nums[i], fMap.getOrDefault(nums[i], 0) + 1);
            }
        return fMap.values().stream().anyMatch(f -> f > 1);
    }
}