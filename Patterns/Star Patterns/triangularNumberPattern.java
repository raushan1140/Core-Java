import java.util.*;

public class triangularNumberPattern{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
}
