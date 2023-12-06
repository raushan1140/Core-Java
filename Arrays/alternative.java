import java.util.*;

public class alternative{
    public static void alternativeArray(int arr[], int n){
        for(int i=0;i<n;i+=2)
        {
            System.out.print(arr[i]+" ");
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
        alternative(arr,n);
    }
}
