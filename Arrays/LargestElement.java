import java.util.*;

/**
 * LargestElement
 */
public class LargestElement {
    public static int getLargest(int n, int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            largest=arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("The largest element is "+getLargest(n,arr));
    }
}