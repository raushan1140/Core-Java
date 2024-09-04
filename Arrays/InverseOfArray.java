import java.util.*;

/**
 * InverseOfArray
 */
public class InverseOfArray {
    public static int[] inverse(int n,int arr[]){
        int brr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0 && arr[i]<arr.length)
            {
                brr[arr[i]]=i;
            }
        }
        return brr;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int brr[]=inverse(n, arr);
        for(int i=0;i<brr.length;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}