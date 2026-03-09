package Recursion_on_Arrays;

public class BinarySearch {
    static int binarySearch(int[] arr, int search,int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == search){
            return mid;
        }
        if(search > arr[mid]){
           return binarySearch(arr, search, mid+1, end);
        }
        else{
           return binarySearch(arr, search, start, mid);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,23,8,9};
        int search = 23;
        int m = arr.length;
        int value = binarySearch(arr, search, 0 , m-1);
        System.out.println("The value is present in the array: "+ value);

    }
    
}
