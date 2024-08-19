import java.util.*;

/**
 * bubbleSortON
 */
public class bubbleSortON {
    public static void bubbleSort(int n, int arr[]){
        for(int i=0;i<arr.length-1;i++)
        {
            int swap = 0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }

        bubbleSort(n,arr);
        for(int value: arr){
            System.out.print(value+" ");
        }
    }
}