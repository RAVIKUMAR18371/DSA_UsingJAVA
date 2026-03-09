package Heap;

import java.util.ArrayList;
import java.util.List;

public class heapify { // build heap
static void swap(List<Integer> heap, int parent, int index){
        int temp = heap.get(parent);
        heap.set(parent , heap.get(index));
        heap.set(index , temp);
}
static void push_down_in_MinHeap(List<Integer> heap, int l ,int r){
        int n = heap.size() - 1;
        if(l == r){
            return;
        }

        int left = (2 * l) + 1;
        int right = (2 * l) + 2;
        int smallest = l;
        if(left <= n && heap.get(left) < heap.get(smallest)){
            smallest = left;
        }
        if(right <= n && heap.get(right) < heap.get(smallest)){
            smallest = right;
        }
        if(smallest == l){
            return;
        }

        swap(heap, l, smallest);
        push_down_in_MinHeap(heap, smallest, r);
    }
    static void heaPify(List<Integer> heap){
        int first_non_leaf_node = ((heap.size() - 1) / 2); // last element ka parent

        for(int i= first_non_leaf_node;i>=0;i--){
            push_down_in_MinHeap(heap, i, heap.size()-1);

        }

    }
    public static void main(String[] args) {
         List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        heaPify(heap);
        System.out.println(heap);

    }
    
}
