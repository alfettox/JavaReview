import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 1};
        int missingNumber1 = findMissingNumber(array1);
        System.out.println("Missing number: " + missingNumber1);

        int[] array2 = {4, 2, 0, 1};
        int missingNumber2 = findMissingNumber(array2);
        System.out.println("Missing number: " + missingNumber2);

    }


    //O(nlogn).
    private static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

}

//    O(n)   EXPECTED SUM - ACTUAL SUM = missing value
//        int res;
//        int sum = 0;
//        int n = arr.length+1;             //because missing one number
//        int expSum = n*(n-1)/2;           // n(n-1)/2
//        for(int i =0; i< arr.length; i++){
//            sum +=arr[i];
//        }
//        res = expSum-sum;
//
//    }
//