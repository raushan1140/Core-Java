import java.util.*;

public class palindromeBetweenTwo{
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
            int rev=0;
            int temp=i;
            
            while(temp!=0)
            {
                int digit=temp%10;
                rev=rev*10+digit;
                temp=temp/10;
            }
            if(original==rev)
            {
                System.out.println(i);
            }
        }
    }
}
