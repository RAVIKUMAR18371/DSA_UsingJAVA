package Array;
import java.util.*;
import java.util.Collections;
public class subsetProblem {
    static Boolean isSubsetSum(int N, int arr[], int sum){
        HashMap<Integer,Integer> hm = new HashMap<>();
        // code here
        Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
            if(!(hm.containsKey(arr[i]))){
                hm.put(arr[i], 1);
            }
            else{
                int value = hm.get(arr[i]);
                hm.put(arr[i], value++);
            }
       }
        
        int val = sum;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] < sum){
                val = val - arr[i];
                if(hm.containsKey(val)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int arr[] = {7,2,12,20,1,6,7,17,17,8,15};
        int sum = 9;
       Boolean val = isSubsetSum(sum, arr, sum);
       System.out.println(val);
        
        
    }
    
}
