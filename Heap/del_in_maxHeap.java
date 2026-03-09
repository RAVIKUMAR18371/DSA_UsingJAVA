package Heap;

import java.util.ArrayList;

public class del_in_maxHeap {
    static void swap(ArrayList<Integer> al, int index, int smallest){
        int temp=al.get(index);
        al.set(index,al.get(smallest));
        al.set(smallest,temp);
    }
    static void delete_maxHeap(ArrayList<Integer> al ,int index){
        int n = al.size() - 1;
        if(index == n){
            return;
        }
        int left = 2*index + 1;
        int right = 2*index + 2;
        int smallest = index;
        int idx;

        if(smallest <= n && al.get(index) < al.get(left)){
            if(right <= n && al.get(index) < al.get(right)){
                int val = Math.max(al.get(left),al.get(right));
                idx = al.indexOf(val);
                swap(al,idx,smallest);
                delete_maxHeap(al, idx);
            }
        }
        if(smallest == n){
            return;
        }
       
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

        

        delete_maxHeap(al,0);


        System.out.println("After heap will be" + al);
    }
        
    }
    
