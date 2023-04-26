
import java.util.Scanner;

public class armstrong{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=input.nextInt();
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=Math.pow(digit,3);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println(n + " is an Armstrong number.");
        }
        else
        {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
