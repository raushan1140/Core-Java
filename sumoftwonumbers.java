import java.util.Scanner;
public class sumoftwonumbers{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of 1st number: ");         //taking 1st number from user
        int num1=input.nextInt();
        System.out.print("Enter the value of 2nd number: ");         //taking 2nd number from user
        int num2=input.nextInt();
        int sum=num1+num2;                                             //adding the both number
        System.out.println("The sum of 1st and 2nd number is: "+sum);  //it will give the sum in output of 1st num+ 2nd num entered by user
    }
}