import java.util.*;
public class Main{
    public static void printName(String str){
        System.out.println("hey " + str);
        return;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String Str=input.next();
        String Str2=input.next();
        printName(Str);
        printName(Str2);
    }
}