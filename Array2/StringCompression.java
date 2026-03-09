package Array2;
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        String p = "aabcccccaaa";  // Input string
        String str = "";
        List<List<Character>> al = new ArrayList<>();
        List<Character> ll = new ArrayList<>();


        for(int i=0;i<p.length();i++){
            ll.add(p.charAt(i));
            if(i == p.length()-1 || p.charAt(i) != p.charAt(i+1)){
                al.add(ll); 
               ll = new ArrayList<>();
            }
        }
        for(List<Character> arr : al){
            int count = 0;
            for(int i=0;i<arr.size();i++){
                if(i == 0){
                    str = str + arr.get(i);
                }
               count++;
            }
            str = str + count;
        }

        System.out.println(str);
    }
}
