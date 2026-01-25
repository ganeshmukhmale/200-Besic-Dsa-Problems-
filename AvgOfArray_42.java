import java.util.Scanner;

public class AvgOfArray_42 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size]; 

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            sum += arr[i]; 
        }

        System.out.println("Sum of array is: "+ sum);
        System.out.println("Avrage of Array Is: "+(sum/2));
    }
}
