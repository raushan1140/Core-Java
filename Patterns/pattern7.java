import java.util.*;

public class pattern7 {
    public static void pattern(int n){
        for(int i=0;i<n;i++)
        {
            for(int space=0;space<n-i-1;space++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
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
