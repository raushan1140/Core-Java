import java.util.*;

public class pattern11 {
    public static void sol(int n){
        int start=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        sol(n);
    }    
}
