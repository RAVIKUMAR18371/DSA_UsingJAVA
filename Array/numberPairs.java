package Array;
import java.util.*;

public class numberPairs {
    static int MaximumSum(int a[], int n, int count) { 
        // Sort the array to find the two largest elements
        Arrays.sort(a);
        int val = a[n-2] + a[n-1]; // Sum of the two largest elements
        
        // Create a HashMap to count occurrences of each element
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        
        // Iterate through the array to find pairs that sum up to 'val'
        for (int i = 0; i < n; i++) {
            if (hm.get(a[i]) > 0 && hm.getOrDefault(val - a[i], 0) > 0) {
                if (a[i] == val - a[i] && hm.get(a[i]) < 2) {
                    continue;
                }
                count++;
                hm.put(a[i], hm.get(a[i]) - 1);
                hm.put(val - a[i], hm.get(val - a[i]) - 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 3, 5, 1};
        int count1 = MaximumSum(arr, arr.length, 0);
        System.out.println("The count will be: " + count1);
    }
}
