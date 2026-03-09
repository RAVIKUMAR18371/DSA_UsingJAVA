package String;
import java.util.*;

public class khaled_arry {

    static ArrayList<ArrayList<Integer>> picker(ArrayList<Integer> arr, int index, int[] arr1) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (index == arr1.length) {
            result.add(new ArrayList<>(arr));
            return result;
        }

        // Exclude the current element
        result.addAll(picker(new ArrayList<>(arr), index + 1, arr1));

        // Include the current element
        arr.add(arr1[index]);
        result.addAll(picker(new ArrayList<>(arr), index + 1, arr1));

        return result;
    }

    public static void main(String[] args) {
        System.out.println("You can always pick the element ");
        int[] arr1 = {2, 4, 6, 8};

        ArrayList<Integer> al4 = new ArrayList<>();

        ArrayList<ArrayList<Integer>> al3 = picker(al4, 0, arr1);
        System.out.println(al3);
    }
}
