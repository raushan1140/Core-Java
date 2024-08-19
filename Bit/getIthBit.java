import java.util.*;

/**
 * getIthBit
 */
public class getIthBit {

    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i= input.nextInt();
        System.out.println(getIthBit(n,i));
    }
}