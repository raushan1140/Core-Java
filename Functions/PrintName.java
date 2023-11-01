import java.util.*;

public class PrintName{
    public static void printMyName(String name)
    {
        System.out.print(name);
        return;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        printMyName(name);
    }
}
