import java.util.*;

/**
 * factorialofN
 */
public class factorialofN {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(factorial(n));
    }
}