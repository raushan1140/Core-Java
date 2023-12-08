import java.util.*;

public class patternMatching{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        String pattern=input.next();
        ArrayList<Integer>a=new ArrayList<>();
        int ans=str.indexOf(pattern);
        while(ans!=-1)
        {
            a.add(ans);
            ans=str.indexOf(pattern,ans+1);
        }
        System.out.println(a);
    }
}
