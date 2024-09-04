import java.util.*;

public class pattern6 {
    public static void pattern(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
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
