import java.util.*;

public class tillN{
    public static void print(int n, int count){
        if(count>n) return;
        System.out.print(count+" ");
        
        count=count+1;
        print(n,count);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=1;
        print(n,count);
    }
}
