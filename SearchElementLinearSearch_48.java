import java.util.Scanner;

public class SearchElementLinearSearch_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int size = sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("\nEnter Search Element: ");
        int search = sc.nextInt();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Element is Found.");
                count++;
            }
        }
        if(count < 1){
            System.out.println("Element not found.");
        }
    }   
}
