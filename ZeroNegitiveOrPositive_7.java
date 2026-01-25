import java.util.Scanner;

public class ZeroNegitiveOrPositive_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int no = sc.nextInt();
        if (no > 0) {
            System.out.println("Number is an Positive.");
        }
        else if (no < 0) {
            System.out.println("Number is an Negitive.");
        }
        else if (no == 0) {
            System.out.println("Number is an Zero.");
        }
        else{
            System.out.println("It is Not an Number.");
        }

    }
}
