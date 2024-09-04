
import java.util.*;

/**
 * PairsInArray
 */
public class PairsInArray {
    public static void pairs(int n, int arr[]){
        int PairsCount=0;
        for(int i=0;i<arr.length;i++)
        {
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("( "+current + " ," + arr[j] + " )" );
                PairsCount++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+ PairsCount);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        pairs(n,arr);
    }
}