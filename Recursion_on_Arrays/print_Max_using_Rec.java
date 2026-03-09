package Recursion_on_Arrays;

public class print_Max_using_Rec {
   static int value = 0;
   static int sum = 0;
    static void printMax(int[] arr, int i){
        if(i == arr.length){
            System.out.println("Max value is: "+ value);
            System.out.println("The sum of the array: "+ sum);
            return;
        }
        value = Math.max(value,arr[i]);
        sum = sum + arr[i];
        printMax(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 10, 3, 2, 5};
        printMax(arr, 0);

    }
    
}
