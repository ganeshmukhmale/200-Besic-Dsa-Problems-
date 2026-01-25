import java.util.Scanner;

public class ReverceNumber_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int no = sc.nextInt();
        int temp = no;
        int rev = 0;

        while (no != 0) {
            int dig = no%10;
            rev = rev * 10 + dig;
            no = no/10;
        }
        System.out.println("Reverse Number is : "+ rev);

    }
}
