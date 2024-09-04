
import java.util.*;

// package Recursion;

/**
 * printNTo1
 */
public class printNTo1 {
    public static void print(int n){
        if(n<1)
        {
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        print(n);
    }
    
}