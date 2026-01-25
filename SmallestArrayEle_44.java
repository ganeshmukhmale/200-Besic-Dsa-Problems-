import java.util.Arrays;
import java.util.Scanner;

public class SmallestArrayEle_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int min = 0;
        for(int i=0;i<arr.length;i++){
            min = arr[0];
        }

        System.out.println("Max Element is: "+min);
    }
}
