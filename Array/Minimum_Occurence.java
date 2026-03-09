package Array;
import java.util.*;
public class Minimum_Occurence {
    public static void main(String[] args) {
        String str = "cdadcda";
        int min = Integer.MAX_VALUE;
        char array[] = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char c : array){
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else{
                int value = hm.get(c);
                hm.put(c , value++);
            }
        }

        for(char c : array){
            min = Math.min(min, hm.get(c));
        }

        for(char c : array){
            if(hm.get(c) == min){
                System.out.println(c);
                return;
            }
        }

    }
    
}
