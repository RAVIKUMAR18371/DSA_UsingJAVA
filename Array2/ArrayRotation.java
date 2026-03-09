package Array2;
import java.util.*;
public class ArrayRotation {
    static void rotater(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
}

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        int d = 3;

        rotater(arr,0,arr.length-1);
        rotater(arr,0,d-1);
        rotater(arr,d,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
