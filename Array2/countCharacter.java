package Array2;
import java.util.*;
public class countCharacter {
    public static void main(String[] args) {
        String s = "Hello world";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char x : s.toCharArray()) {
            if(x != ' ')
              hm.put(x,hm.getOrDefault(x,0)+1);
        }
        System.out.println(hm);
    }
    
}
