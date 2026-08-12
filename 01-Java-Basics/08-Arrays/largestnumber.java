// Program to find the largest number in an array
public class largestnumber {
    public static void main(String[] args) {
        // Initialize an array with integer values
        int[] arr = { 45, 12, 89, 33, 97, 2 };

        // Variable to store the maximum value, initialized to 0
        int max = 0;

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than max, update max with the current element
            if (arr[i] > max)
                max = arr[i];
        }
        
        // Print the largest number found in the array
        System.out.println(max);
    }
}
