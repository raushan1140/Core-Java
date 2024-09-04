import java.util.*;

/**
 * findFirstOccurance
 */
public class findFirstOccurance {

    public static int firstOcc(int n, int arr[], int i, int key){
        if(arr[i]==key)
        {
            return i;
        }
        return firstOcc(n, arr, i+1, key);
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
        System.out.println(firstOcc(n, arr, 0, key));
    }
}