import java.util.*;

public class perfect{
    public static void perfectArray(int arr[], int n){
        for(int i=0;i<=n/2;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                System.out.print("not Perfect");
                break;
            }
            System.out.print("Perfect Array");
            break;
        }
        return;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        perfectArray(arr,n);
    }
}
