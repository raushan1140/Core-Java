//second largest best case senerio

import java.util.*;

/**
 * SecondLargest
 */
public class SecondLargest {
    public static int secLargest(int n, int arr[]){
        int largest=arr[0];
        int sLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest)
            {
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println(secLargest(n, arr));
    }
}