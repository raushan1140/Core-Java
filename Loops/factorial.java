import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=input.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.print("The factorial of " + n + " is " + fact);
    }
}
