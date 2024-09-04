// package Recursion;

/**
 * printNameNTimes
 */
import java.util.*;

public class printNameNTimes {
    public static void printName(int i,int n){
        if(i>n) return;
        System.out.println("Raj ");
        printName(i+1,n);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printName(1,n);

    }
    
}


/*
 import java.util.*;

public class Main{
    public static void printName(int n){
        if(n<1)
        {
            return;
        }
        printName(n-1);
        System.out.print("Raj"+" ");
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printName(n);
    }
}

 */


 /*
  import java.util.*;

public class Main{
    public static void printName(int n){
        if(n==0)
        {
            return;
        }
        printName(n-1);
        System.out.print("Raj"+" ");
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printName(n);
    }
}
  */