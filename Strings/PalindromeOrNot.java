import java.util.*;

/**
 * PalindromeOrNot
 */
public class PalindromeOrNot {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(isPalindrome(str));
    }
}