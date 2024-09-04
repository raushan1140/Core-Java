// package Recursion;

import java.util.*;

public class gcd {
    public static int gcdOfTwoNumbers(int a, int b){
        if(b==0)
        {
            return a;
        }
        return gcdOfTwoNumbers(b,a%b);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int result=gcdOfTwoNumbers(a, b);
        System.out.println("The GCD of "+a+" and "+b+ " is: "+result);
    }
}
