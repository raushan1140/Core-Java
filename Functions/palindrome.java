import java.util.Scanner;

public class palindrome{
    public static int rev(int n)
    {
        int rem=0;
        int rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int r=rev(n);
        if(r==n)
        {
            System.out.print("Palindrome Number");
        }
        else
        {
            System.out.print("Not a palindrom Number");
        }
        
    }
}
