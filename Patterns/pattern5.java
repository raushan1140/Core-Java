import java.util.*;

public class pattern5{
    public static void pattern(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pattern(n);
    }
}