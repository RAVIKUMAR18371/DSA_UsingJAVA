package String;
import java.util.*;
public class Permutation {
   static ArrayList<String> al = new ArrayList<>();
    
   static void swap(char[] arr,int s1 , int s2){
        char temp = arr[s1];
        arr[s1] = arr[s2];
        arr[s2] = temp;
    }
    static void permutation(char[] arr, int index, int r){
        if(index == r){
            String s = "";
           for(char x : arr){
            s = s + x;
           }
           al.add(s);
            System.out.println(arr);
            return;
        }
        for(int i=index; i< r; i++){
            swap(arr,index , i);
            permutation(arr, index+1, r);
            swap(arr,index , i);
        }
    }
    public static void main(String[] args) {
        String s = "ABC";
        char[] arr = s.toCharArray();
        permutation(arr , 0 , s.length());
        System.out.println(al);
    }
    
}
