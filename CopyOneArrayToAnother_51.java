import java.util.Scanner;

public class CopyOneArrayToAnother_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Array Size: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        int arr2[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }

        
        for(int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
