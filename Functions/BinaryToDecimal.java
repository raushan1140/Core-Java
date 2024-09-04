import java.util.*;

/**
 * BinaryToDecimal
 */
public class BinaryToDecimal {

    public static void binToDec(int n){
        int pow=0;
        int dec=0;
        while(n>0)
        {
            int lastDigit=n%10;
            dec=dec+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println(dec);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        binToDec(n);
    }
}