import java.util.Scanner;

public class CountEvenOddArray_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        int Even=0, Odd=0;

        for(int i=0;i<size;i++){
            if (arr[i]%2==0) {
                Even++;
            }
            else if (arr[i]%2!=0) {
                Odd++;
            }
        }
        System.out.println("Even No is: "+ Even + "\nOdd Number is: "+Odd);
    }   
}
