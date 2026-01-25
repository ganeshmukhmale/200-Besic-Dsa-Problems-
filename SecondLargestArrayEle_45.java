import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestArrayEle_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int second = 0;

        for(int i=0;i<arr.length;i++){
            second = arr[arr.length-2];
        }

        System.out.println("Second largest no is: "+ second);
    }
}
