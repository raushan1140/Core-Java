import java.util.Scanner;

public class binaryToDecimal{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int base=1;
        int rem=0;
        int digit=0;
        while(n!=0)
        {
            String binary=input.nextLine();
            rem=n%10;
            digit= digit+rem*base;
            n=n/10;
            base=base*2;
        }
        System.out.print(digit);
    }
}
