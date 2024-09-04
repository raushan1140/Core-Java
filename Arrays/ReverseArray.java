//reverse an array usign two pointer method

import java.util.*;

/**
 * ReverseArray
 */
public class ReverseArray {
    public static void reverse(int n, int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        reverse(n, arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}