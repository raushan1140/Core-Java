import java.util.*;

//check every element of array is pamindrome or not if yes return 1 else return 0;


public class palendromic{
    public static boolean isPalindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return temp==rev;
        
    }
    public static int palindromic(int n, int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            if(!isPalindrome(arr[i]))
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.print(palindromic(n,arr));
    }
}