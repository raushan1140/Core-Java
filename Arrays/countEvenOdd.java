import java.util.Scanner;

public class countEvenOdd{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements in array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        System.out.println("No. of Even elements in array is: "+countEven);
        System.out.println("No. of Odd elements in array is: "+countOdd);
    }
}
