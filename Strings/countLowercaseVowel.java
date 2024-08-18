import java.util.*;

/**
 * countLowercaseVowel
 */
public class countLowercaseVowel {
    public static int count(String str){
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(count(str));

    }
}