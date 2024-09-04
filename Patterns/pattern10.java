// import java.util.*;

// public class pattern10 {
//     public static void sol(int n){
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=1;i<n;i++)
//         {
//             for(int j=1;j<n-i+1;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         sol(n);
//     }    
// }

import java.util.*;

/**
 * pattern10
 */
public class pattern10 {
    public static void sol(int n){
        for(int i=1;i<=2*n-1;i++)
        {
            int star=i;
            if(i>n)
            star = 2*n-i;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        sol(n);
    }
}
