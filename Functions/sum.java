import java.util.Scanner;

public class sum{
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int sum=calculateSum(a,b);
        System.out.println(sum);
    }
}
