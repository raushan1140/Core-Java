import java.util.*;

/**
 * CapilitizetheTitle
 */
public class CapilitizetheTitle {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch  = Character.toUpperCase(str.charAt(0));

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(toUpperCase(str));
    }
}