import java.util.*;

/**
 * BinaryStringProblem
   >> print all binary strings of size n, without consecutive ones.
 */
public class BinaryStringProblem {
    public static void print(int n, int lastPlace, String str){
        if(n==0)
        {
            System.out.print(str+" ");
            return;
        }
        // if(lastPlace==0)
        // {
        //     print(n-1, 0, str+"0");
        //     print(n-1, 1, str+"1");
        // }
        // else
        // {
        //     print(n-1, 0, str+"0");
        // }

        /* we can also write as */

        print(n-1, 0, str+"0");
        if(lastPlace==0)
        {
            print(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(n, 0, "");
    }
}