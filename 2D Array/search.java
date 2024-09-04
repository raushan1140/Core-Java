import java.util.*;

/**
 * search
 */
public class search {

    public static boolean searchElement(int n, int m, int arr[][], int key){
        int row=0;
        int col=arr[0].length-1;
        
        while(row<arr.length && col>=0)
        {
            if(arr[row][col]==key)
            {
                System.out.print("found at ( " + row + "," + col +" )");
                return true;
            }
            else if(key<arr[row][col])
            {
                col--;
            }
            else row++;
        }
        System.out.print("Not Found");
        return false;
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
        int key=input.nextInt();
        searchElement(n, m, arr, key);
    }
}