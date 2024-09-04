import java.util.*;

/**
 * SubArrays
 */
public class SubArrays {
    public static void PrintSubArrays(int n, int arr[]){
        int totalSubarray=0;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray: "+totalSubarray);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        PrintSubArrays(n, arr);
    }
}