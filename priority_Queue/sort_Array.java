package priority_Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class sort_Array {
    static ArrayList<Integer> al = new ArrayList<>();
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,7,12,89,45};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            al.add(pq.poll());
        }

        System.out.println(al);
    }
    
}
