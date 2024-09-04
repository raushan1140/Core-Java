import java.util.*;

/**
 * BinarySearch  time complexity= O(logn);
 */
public class BinarySearch {

    public static int binSearch(int n, int arr[], int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key) return mid;
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int key=input.nextInt();
        System.out.print("Element Found at Index: "+ binSearch(n, arr, key));
    }
}