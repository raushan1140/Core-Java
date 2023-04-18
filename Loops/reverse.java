import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int rev=0;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        System.out.print(rev); 
    }
}
