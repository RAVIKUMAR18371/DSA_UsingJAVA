package Heap;

import java.util.ArrayList;
import java.util.List;

public class maxheap {
    static void swap(List<Integer> heap, int parent, int index){
        int element = heap.get(index);
        int temp = heap.get(parent);
        heap.set(parent , heap.get(index));
        heap.set(index , temp);

        // Recursive doing for all
        insert_in_MaxHeap(heap, element);
    }
    static void insert_in_MaxHeap(List<Integer> heap, int element){
        if(!heap.contains(element)){
            heap.add(element);
        }
        int index = heap.indexOf(element);
        int parent = (index-1)/2;
        if(index == 0 || heap.get(parent) > element){
            return;
        }
        swap(heap,parent,index);        

    }
     public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(10);
        System.out.println(heap);
        insert_in_MaxHeap(heap, 40);
        System.out.println(heap);
    
}
}
