import java.util.Scanner;
public class sumoftwonumbers{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of 1st number: ");
        int num1=input.nextInt();
        System.out.print("Enter the value of 2nd number: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of 1st and 2nd number is: "+sum);
    }
}