import java.util.*;

/**
 * largestElement
 */
public class largestElement {

    public static int largest(int n, int m, int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
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

        System.out.println(largest(n, m, arr));
    }
}