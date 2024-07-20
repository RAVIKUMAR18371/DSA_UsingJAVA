package SORTINGALGORITHM;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class selectionSort {
    static void selection(int[] arr, int j, int element, int n){
        if(n==0){
            return;
        }
        for(int i=0;i<arr.length;i++){
          if(arr[i] == element){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
    }
        return;
    }
    public static void main(String[] args) {
        int[] arr = {10, 23, 18, 16, 13};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i < arr.length; i++){
            pq.add(arr[i]);
        }
        System.out.println(pq.peek());
        int n = arr.length;
        for(int i=0;i<arr.length; i++){
            int element = pq.poll();
              selection(arr, i , element, --n);
        }
        System.out.println(Arrays.toString(arr));
        
    }
    
}
