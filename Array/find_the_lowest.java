package Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class find_the_lowest {
    public static void main(String[] args) {
        int arr[] = {2,4,3,1,5};
        int k=3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i < arr.length; i++){
            pq.add(arr[i]);
        }
        
        for(int i=0;i<k;i++){
            int a = pq.remove();
            int b = pq.remove();
            int product = a * b;
            pq.add(product);  
        }

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<=pq.size();i++){
            pq1.add(pq.poll());
        }
        System.out.println(pq1.peek());
        

    }

}
    
