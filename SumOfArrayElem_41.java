import java.util.Scanner;

public class SumOfArrayElem_41 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter an Array Size: ");
        int size = Sc.nextInt();
        int arr[] = new int[size];

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = Sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum of Array is: "+ sum);
    }
}
