import java.util.*;


/**
 * updateIthBit
 */
public class updateIthBit {
    public static int getIthBit(int n, int i){
        int bitmask =1<<i;
        return n | bitmask;
    }
    public static int clear(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int update(int n, int i, int newBit){
        // if(newBit==0)
        // {
        //     return clear(n,i);
        // }
        // else
        // {
        //     return setIthBit(n,i);
        // }
         n =clear(n,i);
        int bitmask = newBit<<i;
        return n | bitmask;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = input.nextInt();
        int newBit = input.nextInt();
        System.out.println(update(n,i,newBit));
    }
}