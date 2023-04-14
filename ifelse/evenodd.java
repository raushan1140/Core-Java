import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=input.nextInt();                      //taking input from user
        if(n%2==0)
        {
            System.out.print(n+" is even");
        }
        else
        {
            System.out.println(n+"is odd");
        }
    }
}
