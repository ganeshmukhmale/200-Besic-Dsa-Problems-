import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LargestArrayEle_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = arr[arr.length-1];
        }

        System.out.println("Max Element is: "+max);
    }
}
