import java.util.ArrayList;
import java.util.List;

public class FindPairs{

     public static void findPair(int[] arr, int target) {
        // Create a list to store elements 
        List<Integer> list = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // Check if the complement exists in the list
            if (list.contains(complement)) {
                System.out.println("Pair found (" + complement+ ", " + arr[i] + ")");
                return;
            }
            else{
                 // Add the current element to the list
                 list.add(arr[i]);
            }
            
        }

        // If no pair is found, print "Pair not found"
        System.out.println("Pair not found.");
    }

    public static void main(String[] args) {
        //First Test Case
        System.out.println("----------------");
        System.out.println("First Test Case");
        System.out.println("----------------");
        int[] array1 = {8, 7, 2, 5, 3, 1};
        int target1 = 10;
        findPair(array1, target1);

        //Second Test Case
        int[] array2 = {5, 2, 6, 8, 1, 9};
        int target2 = 12;
        System.out.println("----------------");
        System.out.println("Second Test Case");
        System.out.println("----------------");
        findPair(array2, target2);
    }
}
