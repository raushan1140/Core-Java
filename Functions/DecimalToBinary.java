import java.util.*;

/**
 * DecimalToBinary
 */
public class DecimalToBinary {
    public static void decToBin(int n){
        int pow=0;
        int binNum=0;
        while(n>0)
        {
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        decToBin(n);
    }
}