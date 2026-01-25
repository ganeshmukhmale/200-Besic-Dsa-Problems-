import java.util.Scanner;

public class Find_Largest_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 >num3) {
            System.out.println("First Number is Largest: "+ (num1));
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Second Number is Largest: "+(num2));
        }
        else{
            System.out.println("Third Number is Largest: "+ (num3));
        }
    }
}
