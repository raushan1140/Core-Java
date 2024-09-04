import java.util.*;

/**
 * sumofNumbersInsecondRow
 */
public class sumofNumbersInsecondRow {
    public static int sumR(int n, int m, int arr[][]){
        int sum=0;
        int secondRowIdx=1;
        for(int j=0;j<arr[secondRowIdx].length;j++)
        {
            sum+=arr[secondRowIdx][j];
        }
        return sum;
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
        System.out.println(sumR(n, m, arr));
    }
}