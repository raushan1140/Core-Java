import java.util.*;

public class maxElement{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elemenst of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[0]<arr[i])
            {
                arr[0]=arr[i];
            }
        }
        System.out.print("The max element of arrays is: " + arr[0]);
    }
}
