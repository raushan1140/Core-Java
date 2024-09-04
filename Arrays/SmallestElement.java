import java.util.*;

/**
 * SmallestElement
 */
public class SmallestElement {
    public static int getSmallest(int n, int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(smallest>arr[i])
            smallest=arr[i];
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Smallest Elemetnt in Array is: "+ getSmallest(n, arr));
    }
}