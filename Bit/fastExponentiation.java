import java.util.*;

public class fastExponentiation {
    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        System.out.println(fastExpo(a, n));
    }
}
