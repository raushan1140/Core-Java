import java.util.*;
public class inverse{
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=0;
		int index=1;
		while(n!=0)
		{
			int rem=n%10;
			ans+=index*Math.pow(10,rem-1);
			index++;
			n/=10;
		}
		System.out.print(ans);
    }
}
