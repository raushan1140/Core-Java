import java.util.*;

public class rightTriangle{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numebr of rows: ");
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
