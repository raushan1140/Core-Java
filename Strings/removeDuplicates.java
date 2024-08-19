import java.util.*;

/**
 * removeDuplicates
 */
public class removeDuplicates {
    public static String remove(String str){
        boolean seen[] = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!seen[ch])
            {
                seen[ch]=true;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(remove(str));
    }
}