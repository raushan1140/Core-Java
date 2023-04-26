import java.util.*;
public class simple{
    public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		while(true)
		{
			sum=sum+n;
			if(sum<0)
			break;
			System.out.println(n);
		}
    }
}
