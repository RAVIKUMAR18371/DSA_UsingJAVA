package String;
import java.util.*;

public class palindromicSubstring {
   static ArrayList<ArrayList<String>> al = new ArrayList<>();
    static void recur(String s){
        int value = (int)Math.pow(2, s.length());
        for(int i=0;i<value;i++){
            String sp = "";
             ArrayList<String> ll = new ArrayList<>();
            for(int j=0;j<s.length();j++){
                if((i & (1 << j)) != 0){
                    sp+=s.charAt(j);
                }
            }
            ll.add(sp);
            al.add(ll);
        }
    }
    public static void main(String[] args) {
        String s = "babad";
        recur(s);
        System.out.println(al);
       
    }
    
}
