package Recursion_on_Arrays;

public class printing_array {
    static void print_arr(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index] + " ");
        print_arr(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        print_arr(arr, 0);
    }
}
