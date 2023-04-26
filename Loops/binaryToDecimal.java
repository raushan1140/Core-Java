import java.util.*;
public class binaryToDecimal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
			int binary=sc.nextInt();
			int decimal=0;
			int pow=1;
			while(binary!=0)
			{
				decimal+=(binary&1)*pow;
				pow*=2;
				binary=binary/10;
				
			}
			System.out.println(decimal);

			t--;
		}
    }
}
