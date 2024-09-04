import java.util.*;

// package Arrays;

/**
 * ArraysAsFunctionAugu
 */
public class ArraysAsFunctionAugu {
    public static void update(int marks[], int nonChangable){
        nonChangable=10;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks[]={99,78,69,44};
        int nonChangable=5;
        update(marks,nonChangable);
        System.out.println(nonChangable);
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
    }
}