import java.util.*;

public class nthFibonacci{
    public static int fibonacci(int n){
        if(n<=1)
        {
            return n;
        }
        int prev=0;
        int current=1;
        for(int i=2;i<=n;i++)
        {
            int temp=current;
            current=prev+current;
            prev=temp;
        }
        return current;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int result=fibonacci(n);
        System.out.print(result);
    }
}