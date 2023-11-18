import java.util.Arrays;


//BigO(n)
public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 3, 4, 4, 5};
        myArray = uniqueElements(myArray);
        System.out.println(Arrays.toString(myArray));
    }


    private static int[] uniqueElements(int[] myArray) {
        return Arrays.stream(myArray)
                .distinct()
                .toArray();
    }


    /*

    BigO(n)
      Arrays.sort(myArray);
        int uniqueCount = 0;

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] != myArray[i + 1]) {
                myArray[uniqueCount++] = myArray[i];
            }
        }

        myArray[uniqueCount++] = myArray[myArray.length - 1]; // Add the last element

        // Create a new array containing only the unique elements
        int[] uniqueArray = Arrays.copyOf(myArray, uniqueCount);
        return uniqueArray;
     */
}
