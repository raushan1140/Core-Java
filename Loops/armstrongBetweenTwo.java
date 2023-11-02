import java.util.*;

public class armstrongBetweenTwo{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int start=input.nextInt();
        int end=input.nextInt();
        if(start>end)
        {
            System.out.print("Start should must be greater than or equal to end");
        }
        for(int i=start;i<=end;i++)
        {
            int original=i;
            int sum=0;
            int idigits=(int) Math.log10(i)+1;
            int temp=i;
            
            while(temp!=0)
            {
                int digit=temp%10;
                sum+=Math.pow(digit,idigits);
                temp=temp/10;
            }
            if(original==sum)
            {
                System.out.println(i);
            }
        }
    }
}
