import java.util.*;

/**
 * MaxSumSubArray using brute force. TimeComplexity=o(n^3);
 */
public class MaxSumSubArray {
    public static void MaxSub(int n, int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++)
                {
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("MaxSum= "+maxSum);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        MaxSub(n, arr);
    }
}