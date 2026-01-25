import java.util.Scanner;

public class SumOfTwoNo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1st : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2nd : ");
        int num2 = sc.nextInt();
        System.out.println("Addition of Two Number: "+(num1+num2));
        sc.close();
    }   
}
