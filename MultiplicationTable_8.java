import java.util.Scanner;

public class MultiplicationTable_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table Number: ");
        int no = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(no+ " x " + i + " = "+ (no*i));
        }
    }
}
