package Heap;

import java.util.ArrayList;
import java.util.List;

public class Sort_heap {
    static ArrayList<Integer> al = new ArrayList<>();
    static void swap( List<Integer> heap, int smallest, int non_leaf){
        int temp = heap.get(non_leaf);
        heap.set(non_leaf, heap.get(smallest));
        heap.set(smallest, temp);

    }

    static void heapSort(List<Integer> heap){
        int val = heap.size() - 1;
        swap(heap,heap.get(0), val);
        al.add(heap.get(val));
        heap.remove(val);
        heapify_MinHeap(heap, heap.size());

    }
    static void heapify_MinHeap(List<Integer> heap, int n){
        int non_leaf = ((n-1)-1)/2;
        int smallest = non_leaf;
        for(int i=non_leaf;i>=0;i--){
            int left = 2*non_leaf + 1;
            int right = 2*non_leaf + 2;
            if(heap.get(left) < heap.get(non_leaf) && heap.get(left) < heap.get(right)){
                smallest = left;
            }
            if(heap.get(right) < heap.get(non_leaf) && heap.get(right) < heap.get(left)){
                smallest = right;
            }
            if(smallest == non_leaf){
                return;
            }
            swap(heap,smallest,non_leaf);
            n--;
            heapify_MinHeap(heap, n);
            heapSort(heap);

        }
    }
    public static void main(String[] args) {
         List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(10);
        heap.add(80);
        heap.add(50);
        heap.add(5);
        heap.add(20);
        heap.add(70);
        System.out.println(heap);
        heapify_MinHeap(heap, heap.size());
        System.out.println(heap);
        System.out.println();

        System.out.println(al);
        
    }
    
}
