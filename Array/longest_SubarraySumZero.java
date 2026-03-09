package Array;

import java.util.*;

public class longest_SubarraySumZero {
    public static void main(String[] args) {
        int array[] = {1, 2, -2, 4, -4};
        int n = 5;
     
            // Your code here
            HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
    
            int maxi = 0;
            int sum = 0; 
    
            for(int i = 0;i<n;i++) {
    
                sum += array[i]; 
    
                if(sum == 0) {
                    maxi = i + 1; 
                }
                else {
                    if(mpp.get(sum) != null) {
    
                        maxi = Math.max(maxi, i - mpp.get(sum)); 
                    }
                    else {
    
                        mpp.put(sum, i); 
                    }
                }
            }
            System.out.println(maxi); 
        }
    
    }

