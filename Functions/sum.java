import java.util.*;

/**
 * sum
 */
public class sum {
    public static int sumOfTwo(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int res=sumOfTwo(a, b);
        System.out.println(res);
    }
}