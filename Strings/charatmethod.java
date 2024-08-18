import java.util.*;

/**
 * charatmethod
 */
public class charatmethod {
    public static void print(String str){
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        print(str);
    }
}