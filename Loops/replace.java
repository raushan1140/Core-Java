
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        long newN=0;
        long place=1;
        if(n==0)
		{
			System.out.print("5");
			return;
		}
        while(n!=0)
        {
            long digit=n%10;
            if(digit==0)
            {
                digit=5;
            }
            newN=digit*place+newN;
            place=place*10;
            n=n/10;
        }
        System.out.print(newN);
    }
}
