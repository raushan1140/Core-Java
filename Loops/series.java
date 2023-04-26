import java.util.*;

public class series{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int ans;
        int i=1;
        for(int count=1;count<=num1;)
        {
             ans=3*i+2;
            if(ans%num2!=0)
            {
                System.out.println(ans);
                count++;
            }
            i++;
        }
    }
}
