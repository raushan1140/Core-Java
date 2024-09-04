import java.util.*;

public class removeDuplicatesFromString{
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        
        if(idx==str.length())
        {
            System.out.print(newStr);
            return;
        }
        char currCh = str.charAt(idx);
        if(map[currCh-'a']==true)
        {
            removeDuplicate(str, idx+1, newStr, map);
        }
        else
        {
            map[currCh-'a']=true;
            removeDuplicate(str, idx+1, newStr.append(currCh), map);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}