import java.util.Scanner;

public class tut2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();
        int max=Math.max(c, Math.max(a, b));  //here we're using math class to compare values
        System.out.print(max);
    }
}
