import java.util.*;
public class countDigit {
    public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=input.nextInt();
		int rem=0;
		int count=0;
		while(n>0)
		{
			rem=n%10;
			count++;
			n=n/10; 
		}
		System.out.print(count);

    }
}
