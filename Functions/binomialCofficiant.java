import java.util.*;

/**
 * binomialCofficiant
 */
public class binomialCofficiant {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int bincoff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int bincof=fact_n/(fact_r*fact_nmr);
        return bincof;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int r=input.nextInt();
        System.out.println(bincoff(n, r));
        
    }
    
}