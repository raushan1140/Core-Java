import java.util.Scanner;

public class pattern13 {
    public static void sol(int n){
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                System.out.print(num+" ");
                num=num+1;
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
