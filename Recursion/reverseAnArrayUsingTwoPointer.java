import java.util.*;

/**
 * reverseAnArrayUsingTwoPointer
 */
public class reverseAnArrayUsingTwoPointer {
    public static void rev(int n, int arr[], int l, int r){
        if(l>=r)
            return;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        rev(n, arr, l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        rev(n,arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

