package Array2;
import java.util.*;

public class moveZeroEnd {
    static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    static void makeToEnd(int[] arr, int p){
        int n = arr.length;
        int k = p % n;

        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));

        reverse(arr, 0, k - 1);
        System.out.println(Arrays.toString(arr));

        reverse(arr, k, n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        makeToEnd(arr, k);
    }
    
}
