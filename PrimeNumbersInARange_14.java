import java.util.Scanner;

class primerange{
    void range(int range){
        for(int i=1;i<=range;i++)
        {
            int count = 0;
            for(int k=1;k<=i;k++)
            {
                if(i%k==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
            count = 0;
        }
    }
    
}
public class PrimeNumbersInARange_14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range = sc.nextInt();
        
        primerange primerange = new primerange();
        primerange.range(range);
    }
}
