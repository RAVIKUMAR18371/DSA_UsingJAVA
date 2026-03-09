package String;
import java.util.*;

public class Pairs_Array {
    static int count = 0;
    static ArrayList<ArrayList<Integer>> al3 = new ArrayList<>();

    static void checking(PriorityQueue<Integer> pq, ArrayList<Integer> al, int size, int index, int[] arr) {
        if (pq.isEmpty()) {
            return;
        }

        int val = pq.remove();

        for (int i = al.indexOf(val); i < size; i++) {
            ArrayList<Integer> ll = new ArrayList<>();
            if (val > al.get(i)) { // Changed the condition to ">"
            int value = al.indexOf(val);
            int value2 = al.indexOf(al.get(i));
                ll.add(arr[value]);
                ll.add(arr[value2]);
                count = count + 1;
            }

            if (!ll.isEmpty()) {
                al3.add(ll);
            }
        }
        checking(pq, al, size, index + 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 10, 2, 4, 1, 6};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> al2 = new ArrayList<>();

        // Populate the priority queue and al2 list with i * arr[i]
        for (int i = 0; i < arr.length; i++) {
            pq.add(i * arr[i]);
            al2.add(i * arr[i]);
        }

        checking(pq, al2, al2.size() - 1, 0, arr);

        // Output the results
        System.out.println("Count of valid pairs: " + count);
        System.out.println("Pairs: " + al3);
    }
}
