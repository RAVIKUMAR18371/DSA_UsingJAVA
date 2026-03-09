package String;
import java.util.*;
/**
 * Input: str = “ASbBsd” 
Output: 2 
Operations 1: “ASbBsd” -> “ASsd” 
Operations 2: “ASsd” -> “Ad” 
The string cannot be reduced further.
 */

public class swotString {
    static String reduce(String S) {
        // code here
        List<Character> C = new ArrayList<Character>();
        for(int i=0;i<S.length();i++){
            C.add(S.charAt(i));
        }
        for(int i=0;i<S.length();i++){
        int val = (int)(S.charAt(i)) - '0';
        if(val >= 97){
            int val2 = 97 - 32;
            int val3 = (int)(S.charAt(i+1)) - '0';
            if(val2 == val3){
                C.remove(i);
                C.remove(i+1);
            }
        }
    }
    reduce(C.toString());
    return C.toString();
}
    public static void main(String[] args) {
        String str = "ASbBsd";
        String s = reduce(str);
        System.out.println(s);

    }
    
}
