import java.util.Scanner;

public class PalindromNumber_12 {
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

        if(rev == temp){
            System.out.println("It is an Palindrom.");
        }
        else{
            System.out.println("It is not an Palindrom.");
        }
    }
}
