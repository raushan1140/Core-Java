import java.util.*;


/**
 * setIthBit
 */
public class setIthBit {
    public static int getIthBit(int n, int i){
        int bitmask =1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int n = input.nextInt();
        int i = input.nextInt();
        System.out.println(getIthBit(n, i));
    }
}