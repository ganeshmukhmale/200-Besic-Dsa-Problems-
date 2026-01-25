import java.util.Scanner;

class Way {
    public void Way1(int num1, int num2){
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("First Way: "+ num1 +" " + num2);
    }

    public void Way2(int num1, int num2){
        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;
        System.out.println("Second Way: "+num1+" " + num2);
    }

    public void Way3(int num1, int num2){
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("Third Way: "+num1+" " + num2);
    }
}

public class SwapWithout3rdNo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1st No: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2nd No: ");
        int num2 = sc.nextInt();

        
        Way way = new Way();
        /*Using First Way*/
        way.Way1(num1, num2);
        /*Using Second Way*/
        way.Way2(num1, num2);
        /*Using Third Way*/
        way.Way3(num1, num2);
        sc.close();
    }
}
