import java.util.*;

/**
 * diagonalSum
 */
public class diagonalSum {
    //bruteforce tc = o(n^2);

    // public static int dSum(int n, int m, int matrix[][]){
    //     int sum=0;
    //     for(int i=0;i<matrix.length;i++)
    //     {
    //         for(int j=0;j<matrix[0].length;j++)
    //         {
    //             if(i==j)
    //             {
    //                 sum+=matrix[i][j];
    //             }
    //             else if(i+j==matrix.length-1)
    //             {
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    public static int dSum(int n, int m, int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            sum+=matrix[i][i];
            if(i !=matrix.length-1-i)
            {
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println(dSum(n, m, matrix));
    }
}