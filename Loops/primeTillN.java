import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int prime;
        for(int i=2;i<=n;i++)
        {
            prime=1;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    prime=0;
                    break;
                }
            }
            if(prime==1)
            {
                System.out.println(i);
            }
        }
    }
}
