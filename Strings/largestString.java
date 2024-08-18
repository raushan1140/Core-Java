import java.util.*;

/**
 * largestString
 */
//lexicographically

public class largestString {
    public static String laString(String Fruits[]){
        String largest = Fruits[0];
        for(int i=1;i<Fruits.length;i++)
        {
            if(largest.compareToIgnoreCase(Fruits[i])<0)
            {
                largest=Fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String Fruits[] = new String[n];
        for(int i=0;i<n;i++)
        {
            Fruits[i] = input.next();
        }
        System.out.println(laString(Fruits));
    }
}