import java.util.*;

/**
 * maxSumSubPrefix TimeComplexity= O(n^2).
 */
public class maxSumSubPrefix {
    public static void maxSum(int n, int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                if(start==0)
                {
                    currSum=prefix[end];
                }
                else
                {
                    currSum=prefix[end]-prefix[start-1];
                }
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum: "+maxSum);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        maxSum(n, arr);
    }
}