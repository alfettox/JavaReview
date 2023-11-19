import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result;
        long startTime;
        long endTime;
        long elapsedTime;

        // Not optimized
        startTime = System.nanoTime();
        result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Result 1: " + Arrays.toString(result));
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1_000;
        System.out.printf("Elapsed time: %d\n", elapsedTime);

        startTime = System.nanoTime();
        result = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Result 2: " + Arrays.toString(result));
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1_000;
        System.out.printf("Elapsed time: %d\n", elapsedTime);

        startTime = System.nanoTime();
        result = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Result 3: " + Arrays.toString(result));
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1_000;
        System.out.printf("Elapsed time: %d\n", elapsedTime);

        //Optimized
        startTime = System.nanoTime();
        result = twoSumOpt(new int[]{2, 7, 11, 15}, 9);
        System.out.println("OPT Result 4: " + Arrays.toString(result));
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1_000;
        System.out.printf("Elapsed time: %d\n", elapsedTime);
    }

    //O(n)
    private static int[] twoSumOpt(int[] arr, int t) {
        Map<Integer, Integer> cMap = new HashMap<>();
        int comp;
        for (int i = 0; i < arr.length; i++) {
            comp = t - arr[i];
            if(cMap.containsKey(comp)){
                return new int[]{i, cMap.get(comp)};
            }
            cMap.put(arr[i],i);
        }
        return new int[0];
    }

    //Time complexity O(n)^2
    private static int[] twoSum(int[] arr, int t) {
        int comp;
        for (int i = 0; i < arr.length; i++) {
            comp = -arr[i] + t;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == comp) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
