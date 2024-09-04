import java.util.*;

/**
 * sum
 */
public class passbyValue {
    public static void doSomething(int n){
        System.out.println(n);
        n+=5;
        System.out.println(n);
        n+=10;
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        doSomething(n);
        System.out.print(n);
        return;
        
    }
}