import java.util.*;

public class clearLastIthBit {
    public static int clearLast(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = input.nextInt();
        System.out.println(clearLast(n, i));
    }
}
