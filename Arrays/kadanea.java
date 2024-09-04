import java.util.*;

/**
 * kadanea
 */
public class kadanea {
    public static void maxSum(int n, int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currSum=currSum+arr[i];
            if(currSum<0)
            {
                currSum=0;
            }
            maxSum=Math.max(currSum, maxSum);
        }
        System.out.print("Max Sum: "+maxSum);
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