import java.util.Scanner;                       //to take input from system we import scanner function 
public class input{
    public static void main(String[] args){
        System input=new Scanner(System.in);
        int a=input.nextInt();                  //here we're taking an integer input from user
        System.out.print(a);                    //it will print the value of a given by the user
    }
}
