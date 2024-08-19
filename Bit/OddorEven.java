import java.util.*;
 

/**
 * OddorEven
 */
public class OddorEven {
    public static void evenorodd(int n){
        int bitmask=1;
        if((n & bitmask)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        evenorodd(n);
    }
}