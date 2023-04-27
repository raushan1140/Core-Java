import java.util.Scanner;

public class reverseArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.print("The reverse of array is: ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
