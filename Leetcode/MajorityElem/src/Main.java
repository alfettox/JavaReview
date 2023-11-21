import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,3};

        System.out.println(majorityElementHash(nums));
        System.out.println(majorityElementHashStream(nums));

    }

    private static int majorityElementHashStream(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(-1)
                .intValue();
    }

    /*
    Arrays.stream(nums)           // Step 1: Convert the array to an IntStream
    .boxed()                      // Step 2: Convert the IntStream to a Stream<Integer>
    .collect(                     // Step 3: Collect the elements into a Map
        Collectors.groupingBy(
            Function.identity(),  // Function to group by (identity function, which means group by the element itself)
            Collectors.counting() // Collector to count occurrences of each element
        )
    )
    .entrySet()                           // Step 4: Get a set of entries (key-value pairs) from the map
    .stream()                             // Step 5: Convert the set to a Stream<Map.Entry<Integer, Long>>
    .max(Map.Entry.comparingByValue())    // Step 6: Find the entry with the maximum value (count)
    .map(Map.Entry::getKey)               // Step 7: Map the result to the key (the majority element)
    .orElse(-1)                           // Step 8: If no majority element is found, return -1
    .intValue();                          // Step 9: Convert the result to an int


     */

    private static int majorityElementHash(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
            for (Integer n : nums ){
                map.put(n, map.getOrDefault(n,0)+1);
            }
        int majorityElement = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                majorityElement = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return majorityElement;
    }
}