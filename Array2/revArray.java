package Array2;

import java.util.*;

public class revArray{
    static void reverse(int[] arr, int p){
        // reversing
        int mid = arr.length / 2;
       // int s = 0;
        for(int i=0;i<mid;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;            
        }
        for(int i=0;i<p/2;i++){
            int temp = arr[i];
            arr[i] = arr[p-i-1];
            arr[p-i-1] = temp;
        }
        for(int j = p, s = arr.length - 1;j < s;j++, s--){
            int temp = arr[j];
            arr[j] = arr[s];
            arr[s] = temp;
        }
    }
    public static void main(String[] args){
     int[] arr = {1,2,3,4,5,6,7};
     int d = 3;
     System.out.println(Arrays.toString(arr));
     reverse(arr,d);
     System.out.println(Arrays.toString(arr));
    }
}