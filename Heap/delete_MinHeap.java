package Heap;
import java.util.*;

public class delete_MinHeap {
    static void swap(ArrayList<Integer> al, int smallest, int index){
        int temp = al.get(index);
        al.set(index,al.get(smallest));
        al.set(smallest,temp);
    }
    static void delete_minHeap( ArrayList<Integer> al , int index){
        int n = al.size()-1;
        if(index == n){
            return;
        }
        int smallest = index;
        int left = 2*index + 1;
        int right = 2*index + 2;
        

        if(left <= n && al.get(smallest)>al.get(left)){
            smallest = left;
        }
        if(right <= n && al.get(smallest) > al.get(right)){
            smallest = right;
        }
        if(smallest == index){
            return;
        }

        swap(al,smallest,index);
        delete_minHeap(al, smallest);
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(20);
        al.add(10);
        al.add(40);
        al.add(50);
        al.add(30);
        al.add(60);
        System.out.println("Before heap will be" + al);

        int temp = al.get(al.size()-1);
        /**
         * swapping and deleting initially
         */
        al.set(al.size()-1, al.get(0));
        al.set(0, temp);
        al.remove(al.size()-1);

        delete_minHeap(al,0);


        System.out.println("After heap will be" + al);
    }
    
}
