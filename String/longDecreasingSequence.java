package String;
import java.util.*;
public class longDecreasingSequence {
    public static void main(String[] args) {
        int maxi = 0;
        int arr[] = {15, 27, 14, 38, 63, 55, 46, 65, 85};
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int j = arr.length-1;

            for(int i=arr.length-1;j>=0;j--){
                ArrayList<Integer> ll = new ArrayList<>();
                ll.add(arr[i]);
                j--;
                while(j > 0 && arr[i] > arr[i-1]){
                    ll.add(arr[i]);
                    j--;
                }
            al.add(ll);
        }
        for(ArrayList<Integer> ss : al){
            System.out.println(ss);
            maxi = Math.max(maxi,ss.size());
        }

        System.out.println(maxi);
        
    }
    
}
