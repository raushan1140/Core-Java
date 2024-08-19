import java.util.*;

/**
 * clearRangeOfBits
 */
public class clearRangeOfBits {

    public static int clearRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = ((1)<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=input.nextInt();
        int j=input.nextInt();
        System.out.println(clearRange(n, i, j));
    }
}