import java.util.Scanner;

public class FactorialNumber_10 {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter Factorial Number: ");
        // int no = sc.nextInt();  
        int[] arr={1,2,3,1,2,3,4};

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum ^ arr[i]; 

        }
        System.out.println(sum);

    }
}

