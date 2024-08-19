import java.util.*;

/**
 * swapTwoNumber
 */
public class swapTwoNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        int y =input.nextInt();

        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap: x =" + x + " and y = " + y);
    }
}