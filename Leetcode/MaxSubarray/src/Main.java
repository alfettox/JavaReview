public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};
        System.out.println(maxSubArr(nums));
        System.out.println(maxSubArr(nums2));
        System.out.println(maxSubArr(nums3));
    }

    private static int maxSubArr(int[] nums) {
        int currSum = 0;
        int prevSum =0;
        int i =0;
        while(i< nums.length){
            currSum += nums[i];
            if(currSum>prevSum){
                prevSum = currSum;
            }

            if(currSum < 0)
                currSum =0;

            i++;
        }
        return prevSum;
    }
}