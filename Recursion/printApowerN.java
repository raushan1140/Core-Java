import java.util.*;

/**
 * printApowerN
 */

//tc = o(n) => not much optimal

// public class printApowerN {
//     public static int pow(int a, int n){
//         if(n==0)
//         {
//             return 1;
//         }
//         return a*pow(a, n-1);
//     }
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         int n = input.nextInt();
//         System.out.println(pow(a, n));

//     }
// }

//tc = o(logn) =>optimal

public class printApowerN {
    public static int pow(int a, int n){
        if(n==0)
        {
            return 1;
        }
        int halfpower = pow(a, n/2);
        int halfpowerSquare = halfpower*halfpower;
        //n is odd

        if(n%2!=0)
        {
            halfpowerSquare=a*halfpowerSquare;
        }
        return halfpowerSquare;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        System.out.println(pow(a, n));

    }
}