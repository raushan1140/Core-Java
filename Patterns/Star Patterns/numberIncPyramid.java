import java.util.*;

public class numberIncPyramid{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
