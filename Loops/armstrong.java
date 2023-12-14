import java.util.Scanner;

public class armstrong{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=input.nextInt();
        int num=n;
        int temp=n;
        int sum=0;
        int count=0;
        while(n>0)
        {
            int ld=n%10;
            count=count+1;
            n=n/10;
        }
        int ct=count;
        while(num>0)
        {
            int l=num%10;
            sum+=Math.pow(l,ct);
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.print("Armstrong");
        }
        else
        {
            System.out.print("Not Armstrong");
        }
    }
}
