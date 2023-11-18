import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;


//BigO(n)
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArr = returnUnique(arr);

        System.out.println(Arrays.toString(uniqueArr));
    }

    private static int[] returnUnique(int[] arr) {
        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i : arr) {
            hMap.put(i, hMap.getOrDefault(i, 0) + 1);
        }

        return hMap.keySet().stream()
                .filter(key -> hMap.get(key) == 1)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
