import java.util.*;

public class SquarePrint{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=input.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
