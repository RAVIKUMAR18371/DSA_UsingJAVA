package Array2;
import java.util.*;
public class MatrixRotaNinety {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before 90 degree rotation");
        for(int[] x : arr){
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
        int k = arr.length-1;

        int[][] arr1 = new int[arr.length][arr.length];
        for(int s = 0;s < arr1.length; s++){
           for(int d=k;d>=0;d--){
            arr1[s][k-d] = arr[d][s];
          }
    }
    System.out.println("After 90 degree rotation");
    for(int[] crr : arr1){
        System.out.println(Arrays.toString(crr));
    }
        
    }
    
    
}
