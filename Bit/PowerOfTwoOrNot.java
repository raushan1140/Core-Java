import java.util.*;

/**
 * PowerOfTwoOrNot
 */
public class PowerOfTwoOrNot {
    public static boolean isPowerofTwo(int n){
        if(n<=0) return false;
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPowerofTwo(n));
    }
}