package Array;

import java.util.PriorityQueue;
import java.util.*;

public class sum_btw_K1_K2 {
    public static void main(String[] args) {
        int arr[] = {20,8,22,4,12,10,14};
        int k1 = 3;
        int k2 = 6;
        ArrayList<Integer> al = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        for(int j = 0;j < arr.length; j++){
            al.add(pq.poll());
        }
        System.out.println(al);

        // k1 = 3 so find the third smallest
        int sum = 0;
        int first_kth = al.get(k1-1);
        int second_kth = al.get(k2-1);
        while((al.get(k1) > first_kth) && (al.get(k1) < second_kth)){
            sum = sum + al.get(k1);
            k1++;
        }

        System.out.println("the sum equals "+sum);
    }
    
}
