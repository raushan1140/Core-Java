import java.util.*;

public class parray{
    public static int palendromicArray(int arr[], int n){
        for(int i=0;i<n;i++)
        {
            int b=arr[i];
            int rev=0;
            while(b!=0)
            {
                int rem=b%10;
                rev=rev*10+rem;
                b=b/10;
            }
            if(rev!=arr[i]) return 0;
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
        int result=palendromicArray(arr,n);
        System.out.print(result);
    } 
}
