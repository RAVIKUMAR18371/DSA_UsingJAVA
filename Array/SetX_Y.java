package Array;
/**
 * Input: s = "1234", Y = 30  
Output: 3
Three sets of {12, 3, 4}  

Input: s = "1234", Y = 4 
Output: 4
Four sets of {1}, {2}, {3}, {4} 
 */
import java.util.*;
public class SetX_Y {
    public static void main(String[] args) {
       ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        String s = "1234";
        int Y = 4;

        int val = Integer.parseInt(s);
        while(val > Y){
            int rem = val % 10;
             queue.addFirst(rem);
            val = val / 10;
        }
        queue.addFirst(val);
        System.out.println(queue);
       }  
}
