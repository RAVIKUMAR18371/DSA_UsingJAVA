package Heap;

import java.util.*;

public class minheap {

   static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l , heap.get(r));
        heap.set(r, temp);
    }
  static void push_up_in_minHeap(List<Integer> heap, int index){
        // compare with parent
        int parent_index = (index-1)/2;
         // until root reached / correct position found
        if(index==0 || heap.get(parent_index) < heap.get(index)){
            return;
        }
        // swap
        swap(heap,index,parent_index);

        // again recursive call for again doing same task
        push_up_in_minHeap(heap, parent_index);


    }
    static void insert_in_MinHeap(List<Integer> heap, int element){
        // add in last
        heap.add(element);
        int index = heap.size() - 1;

        push_up_in_minHeap(heap,index);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insert_in_MinHeap(heap, 5);
        System.out.println(heap);
    }
}