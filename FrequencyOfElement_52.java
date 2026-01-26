import java.util.Scanner;

public class FrequencyOfElement_52 {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking size of array
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        // Creating array of given size
        int arr[] = new int[size];

        // Taking elements from user
        System.out.println("Enter elements:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        boolean visited[] = new boolean[size];
        for(int i=0;i<size;i++){
            if (visited[i] == true)
                continue;

            int count = 1;

        for(int j=i+1;j<size;j++){
            if (arr[i] == arr[j]) {
                count++;
                visited[j]=true;
            }
        }
        System.out.println(arr[i]+" -> " + count);
        }
        sc.close();
    }
}
