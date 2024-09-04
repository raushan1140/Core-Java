import java.util.*;

/**
 * FriendsParingProblem
   >>Given a friends, each one can remain single or can be paired up with some other friend. Each can be paired only once.
    Find out the total number of ways in which friends can remain single or can be
 */
public class FriendsParingProblem {

    public static int pairCount(int n){
        if(n<=2)
        {
            return n;
        }
        // //choice 
        // //single
        // int fnm1 = pairCount(n-1);
        // //pair
        // int fnm2 = pairCount(n-2);
        // int pairWays = (n-1)*fnm2;
        // //total ways
        // int totalWays = fnm1+pairWays;

        // return totalWays;

        return pairCount(n-1)+(n-1)*pairCount(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(pairCount(n));
    }
}