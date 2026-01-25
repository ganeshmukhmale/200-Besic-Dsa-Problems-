import java.util.Scanner;

public class PrimeNo_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int no = sc.nextInt();
        int count = 0; 
        for (int i=1; i<=no; i++) {
            if (no%i==0) {
                count = count+1;   
            }
        }
        if(count == 2){
            System.out.println("It is an Prime Number.");
        }
        else{
            System.out.println("It is Not an Prime Number.");
        }
    }
}
