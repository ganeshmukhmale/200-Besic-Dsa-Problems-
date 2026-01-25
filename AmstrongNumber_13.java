import java.util.Scanner;

public class AmstrongNumber_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int no = sc.nextInt();
        int count = 0;
        int temp = no; 
        int sum =0;

        while (temp != 0) {
            temp = temp/10;
            count++;
        }
        System.out.println(count);
        temp = no;

        while (temp!=0) {
            int dig = temp%10;
            int pow = 1;
            for(int i=1;i<=count;i++){
                pow *= dig;
            }

            sum = sum+pow;
            temp = temp/10;
        }
        if(no==sum){
            System.out.println("It is an Amstrong Numnber.");
        }

        else{
            System.out.println("It is Not an Amstrong Numnber.");
        }
    }
}
