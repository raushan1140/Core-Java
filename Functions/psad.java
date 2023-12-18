//print  sum of all divisors

import java.util.*;

public class psad{
    public static int sumOfAllDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int result=sumOfAllDivisors(n);
        System.out.print(result);
    }
}
