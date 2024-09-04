import java.util.*;

/**
 * findLastOccurance
 */
public class findLastOccurance {
    public static int lastOcc(int n, int arr[], int i, int key){
        if(i==arr.length)
        {
            return -1;
        }
        int isFound = lastOcc(n, arr, i+1, key);
        if(isFound==-1 && arr[i]==key)
        {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int key = input.nextInt();
        System.out.println(lastOcc(n, arr, 0, key));
    }
}