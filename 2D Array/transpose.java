import java.util.*;

public class transpose {
    public static void transofmatrix(int rows, int col, int arr[][]){
        int transMtx[][] = new int[col][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                transMtx[j][i]=arr[i][j];
            }
        }
        
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(transMtx[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int col = input.nextInt();
        int arr[][] = new int[rows][col];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        transofmatrix(rows,col,arr);
    }
}