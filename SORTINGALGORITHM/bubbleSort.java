package SORTINGALGORITHM;
import java.util.*;

public class bubbleSort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubblySort(int[] arr, int index){
        if(index > arr.length-2){
            return;
        }
        if(arr[index] > arr[index+1]){
            swap(arr,index, index+1);
        }
        bubblySort(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {10,8,4,1,23,45};
        for(int i=0;i<arr.length-1;i++){
            bubblySort(arr, 0);
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
