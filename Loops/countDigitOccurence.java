import java.util.*;
public class countDigitOccurence{
    public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=input.nextInt();
		int rem=0;
		int count=0;
		System.out.print("Enter the digit you want to count the occurence: ");
		int target=input.nextInt();
		while(n>0)
		{
			rem=n%10;
			n=n/10; 
			if(rem==target)
			{
				count++;
			}
		}
		System.out.print(count);

    }
}


