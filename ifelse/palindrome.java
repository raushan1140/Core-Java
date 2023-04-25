import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int rem=0;
        int rev=0;
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        int r=rev;
        if(r==temp)
        {
            System.out.print("Palindrome Number");
        }
        else
        {
            System.out.print("Not a palindrome Number");
        }
    }
}
