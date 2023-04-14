import java.util.Scanner;
public class maxbttwo{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=input.nextInt();
        if(a>b)
        {
            System.out.print(a + " is greater than " + b);
        }
        else if(b>a)
        {
            System.out.print(b + " is greater than " + a);
        }
        else
        {
            System.out.print(a + " is equal to " + b);
        }
        
        
    }
}
