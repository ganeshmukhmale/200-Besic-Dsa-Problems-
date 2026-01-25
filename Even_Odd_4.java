import java.util.InputMismatchException;
import java.util.Scanner;

public class Even_Odd_4 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter Number : ");
            int num = sc.nextInt();

            if(num%2==0){
            System.out.println("Number: "+num+" Is Even.");
        }
        else if(num%2!=0){
            System.out.println("Number: "+num+" Is Odd.");
        }
        }catch(InputMismatchException e){
            System.out.println("Invalid Number.");
        }
        sc.close();
    }
}
