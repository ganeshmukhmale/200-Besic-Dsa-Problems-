import java.util.Scanner;

/*
 * Program: Search element using Binary Search
 * Condition: Array must be sorted
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class SearchElementBinarySearch_49 {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking size of array
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        // Creating array of given size
        int arr[] = new int[size];

        // Taking sorted elements from user
        System.out.println("Enter sorted elements:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // Input target element to search
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        // Initialize pointers
        int low = 0;          // starting index
        int high = size - 1; // last index

        boolean found = false; // flag to check if element exists

        while(low <= high){

            // Find middle index
            int mid = (low + high) / 2;

            // Case 1: target found at mid
            if(arr[mid] == target){
                System.out.println("Element found at index: " + mid);
                found = true;
                break;  // stop searching
            }

            // Case 2: target smaller than mid → search left half
            else if(target < arr[mid]){
                high = mid - 1;
            }

            // Case 3: target greater than mid → search right half
            else{
                low = mid + 1;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }

        sc.close();
    }
}
