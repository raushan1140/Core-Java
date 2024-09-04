import java.util.*;
public class pattern14 {
    public static void sol(int n){
        for(int i=0;i<n;i++)
        {
            for(char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch+" ");
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
