import java.util.*;

/**
 * TilingProblem => 
    Given a "2*n" board and tiles of size "2*1", count the number of ways to tile the given board using the 2*1 tiles.
    (A tiles can either be place horizontally or vertically).

 */
public class TilingProblem {

    public static int count(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        //vertical choice
        int vertical = count(n-1); 
        int horizontal = count(n-2);
        int totalWays = vertical+horizontal;
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(count(n));
    }
}