import java.util.*;

/**
 * substring
 */
public class substring {
    public static void print(String str){
        String sub="";
        for(int i=0;i<str.length();i++)
        {
            sub+=str.charAt(i);
            System.out.println(sub);
        }
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String str = input.nextLine();
        print(str);
    }
}