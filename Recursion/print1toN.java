// package Recursion;

import java.util.*;

public class print1toN {
    public static void print(int n, int count){
        if(count>n) return;
        System.out.print(count + " ");
        count=count+1;
        print(n, count);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=1;
        print(n, count);

    }
}



/*
    import java.util.*;

    public class Main{
    public static void print(int i,int n){
        if(i>n) return;
        System.out.print(i+" ");
        print(i+1,n);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        print(1,n);
    }
}
 */