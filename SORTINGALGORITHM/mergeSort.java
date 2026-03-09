package SORTINGALGORITHM;
import java.util.*;

public class mergeSort {
    static void divide(int[] arr, int i, int j){
        if(i >= j){
            return;
        }
        int mid = (i+j)/2;
        divide(arr, i, mid);// here--> mid -->is not included
        divide(arr,mid+1,j);
        merge(arr,i,mid,j);
        
    }

    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> al = new ArrayList<>();
        while(low <= mid && mid+1 <= high){
            if(arr[low] < arr[mid]){
                al.add(arr[low]);
                low++;
            }
            else{
                al.add(arr[mid]);
                mid++;
            }

        }
        while(low <= mid){
            al.add(arr[low]);
            low++;
        }
        while(mid+1 <= high){
            al.add(arr[mid]);
            mid++;
        }
    System.out.println(al);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,9,23,45,11};
        int n = arr.length;
        divide(arr, 0, n-1);
        System.out.println();
    }
    
}
