import java.util.*;

/**
 * sumOfN
 */
// public class sumOfN {
//     public static void sum(int i, int sum){
//         if(i<1)
//         {
//             System.out.print(sum);
//             return;
//         }
//         sum(i-1,sum+i);
//     }
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         sum(n,0);
//     }
// }


/**
 * sumOfN recursion based
 */
public class sumOfN {
    public static int sum(int n){
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(sum(n));

    }
}



/**
 * sumOfN formula based
 */
// public class sumOfN {
//     public static int sum(int n){
//         if(n==0)
//         {
//             return 0;
//         }
//         return n*(n+1)/2;
//     }
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         System.out.println(sum(n));
//     }
// }


