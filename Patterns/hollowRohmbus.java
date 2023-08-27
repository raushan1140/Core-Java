import java.util.*;
import java.util.Scanner;
public class hollowRohmbus {
    public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,s;
        for(i=n;i>=1;i--)
        {
            for(s=1;s<=i-1;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
