import java.util.*;

public class checkArmstrong{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        int temp=n;
        int num=n;
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            count=count+1;
            n=n/10;
        }
        while(num>0)
        {
            int digit=num%10;
            sum+=Math.pow(digit,count);
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not an Armstrong Number");
        }
    }
}
