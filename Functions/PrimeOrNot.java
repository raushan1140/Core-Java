
import java.util.*;

/**
 * PrimeOrNot
 */

//optimized
public class PrimeOrNot {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(isPrime(n));
    }
}