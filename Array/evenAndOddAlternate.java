package Array;
import java.util.*;
public class evenAndOddAlternate {
    static void even_Odd(int[] arr){
      PriorityQueue<Integer> set1 = new PriorityQueue<>();
      PriorityQueue<Integer> set2 = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
            set1.add(arr[i]);
            }
           else if(arr[i] % 2 == 1){
                set2.add(arr[i]);
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[0] % 2 == 0){
            if(j % 2 == 0 && !set1.isEmpty()){
                arr[j] = set2.remove(); 
            }
            if(j % 2 == 1 && !set2.isEmpty()){
                arr[j] = set1.remove();
            }
        }
        if(arr[0] % 2 == 1 && j != 0){

            if(j % 2 == 1 && !set2.isEmpty()){
                arr[j] = set2.remove(); 
            }
            if(j % 2 == 0 && !set1.isEmpty()){
                arr[j] = set1.remove();
            }

        }
    }
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 13, 2, 19, 14};
        even_Odd(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
