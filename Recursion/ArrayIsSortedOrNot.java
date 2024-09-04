
import java.util.*;

/**
 * ArrayIsSortedOrNot
 */
public class ArrayIsSortedOrNot {

    public static boolean isSorted(int n, int arr[], int i){
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return isSorted(n, arr, i+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println(isSorted(n, arr, 0));
    }
}