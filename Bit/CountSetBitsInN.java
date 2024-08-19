import java.util.*;

/**
 * CountSetBitsInN
 * tc = o(logn);
 */
public class CountSetBitsInN {
    public static int countSetBits(int n){
        int count = 0;
        while(n>0)
        {
            if((n&1)!=0)    //check our LSB
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(countSetBits(n));
    }
}