import java.util.Scanner;

public class FibonacciSearis_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table Number: ");
        int no = sc.nextInt();

        int m = 0;
        int n = 1;

        for(int i=1;i<=no;i++){
            System.out.print(m+ " ");
            int next = m+n;
            m = n;
            n = next;
        }
    }   
}
