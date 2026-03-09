package Recursion_on_Arrays;
import java.util.*; 

public class All_index_in_array {
   static ArrayList<Integer> al = new ArrayList<>();
    static ArrayList<Integer> allIndex(int[] arr, int index, int value){
        if(index == arr.length){
            return al;
        }
        else if(arr[index] == value){
            al.add(index);
        }
       return allIndex(arr, index+1, value);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,4,4};
        int i = 0;
        ArrayList<Integer> al2 = allIndex(arr, i , 4);
        System.out.println("The index will be on the position: "+ al2);
    }
    
}
