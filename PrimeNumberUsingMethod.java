class prime
{
    void primeno(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                count++;
        }
    }
    if(count==2){
        System.out.println("Number is Primre.");
    }
    else{
        System.out.println("Number is Not an Prime.");
    }
}
}


public class PrimeNumberUsingMethod 
{
    public static void main(String[] args) 
    {
        prime p = new prime();
        p.primeno(2);
    }
}

