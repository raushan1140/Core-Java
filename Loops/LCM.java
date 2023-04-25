
import java.util.Scanner;

public class LCM{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=input.nextInt();
        System.out.print("Enter second number: ");
        int b=input.nextInt();
        
        int i=1;
        int gcd=1;
        
        while(i<=a || i<=b)
        {
            if(a%i==0 && b%i==0)
                gcd=i;
                i++;
        }
        int lcm=(a*b)/gcd;
        System.out.print("The LCM of " +a + " and " + b + " is : "+lcm);
    }
}
