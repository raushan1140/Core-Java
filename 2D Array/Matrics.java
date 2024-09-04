// package 2D Array;

import java.util.*;

public class Matrics{
    public static void print(int n, int m, int arr[][]){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean search(int n, int m, int arr[][], int key){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("found at index" + i+", "+j+" ");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n =input.nextInt();
        int m=input.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=input.nextInt();
            }
        }
        int key = input.nextInt();
        print(n,m,arr);
        search(n, m, arr, key);
    }
}