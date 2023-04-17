import java.util.Scanner;

public class tut2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.print("lowercase");
        }
        else
        {
            System.out.print("Uppercase");
        }
    }
}
