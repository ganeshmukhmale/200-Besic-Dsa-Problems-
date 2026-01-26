import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Array size: ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];
    
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("Enter Second Array size: ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];

        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        int arr3[] = new int[size1+size2];

        for(int i = 0; i < size1; i++){
            arr3[i] = arr1[i];
        }

        for(int i = 0; i < size2; i++){
            arr3[size1 + i] = arr2[i];
        }

        for(int k=0;k<arr3.length;k++){
           System.out.print(arr3[k]+" ");
        }

        sc.close();
    }
}
