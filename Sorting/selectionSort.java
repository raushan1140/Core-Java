

import java.util.*;

/**
 * selectionSort
 */
public class selectionSort {

    public static void selSort(int n, int arr[]){
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        selSort(n, arr);
    }
}