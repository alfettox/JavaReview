import java.util.HashMap;
import java.util.Map;

public class SmallestWindow {

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Create character frequency maps for both strings
        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int requiredChars = targetMap.size(); // Number of unique characters to be included in the window

        // Initialize pointers and variables for the sliding window
        int left = 0, right = 0, minLength = Integer.MAX_VALUE, minLeft = 0, minRight = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            if (targetMap.containsKey(currentChar) && windowMap.get(currentChar).equals(targetMap.get(currentChar))) {
                requiredChars--;
            }

            // Try to contract the window by moving the left pointer
            while (requiredChars == 0) {
                if (right - left < minLength) {
                    minLength = right - left;
                    minLeft = left;
                    minRight = right + 1;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)) {
                    requiredChars++;
                }

                left++;
            }

            // Expand the window by moving the right pointer
            right++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = minWindow(s, t);
        System.out.println("Smallest window containing characters: " + result);
    }
}
