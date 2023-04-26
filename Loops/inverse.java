import java.util.*;
public class inverse{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=input.nextInt();
		int ans=0;
		int index=1;
		while(n!=0)
		{
			int rem=n%10;
			ans+=index*Math.pow(10,rem-1);
			index++;
			n=n/10;
		}
		System.out.print("The inverse of is: " +ans);
	}
}
