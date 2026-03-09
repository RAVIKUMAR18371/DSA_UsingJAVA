package Recursion_on_Arrays;

public class Linear_Search_recursion {
    static boolean search(int[] arr, int search , int i){
        if(i == arr.length){
            return false;
        }
        if(arr[i] == search){
            return true;
        }
        return search(arr, search, ++i);

    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,20,11,15};
        int search = 3;
        boolean searching = search(arr, search, 0);
        System.out.println("The value exist is: "+searching);
    }
    
}
