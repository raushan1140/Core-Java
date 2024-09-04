import java.util.*;

/**
 * occurance
 */
public class occurance {
    public static int countOccurance(int n, int m, int arr[][], int key){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==key)
                {
                    count++;
                }
            }
        }
        return count;
       //tc =o(m+n)


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        int key=input.nextInt();
        System.out.println(countOccurance(n, m, arr, key));
    }
}