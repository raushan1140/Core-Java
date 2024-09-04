import java.util.*;

/**
 * reverseArraySinglePointer
 */
public class reverseArraySinglePointer {
    public static void rev(int n, int arr[], int i){
        if(i>=n/2) return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        rev(n, arr, i+1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        rev(n,arr,0);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}