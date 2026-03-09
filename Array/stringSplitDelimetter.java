package Array;
import java.util.*;
public class stringSplitDelimetter {
    public static void main(String[] args) {
        ArrayList<String[]> ll = new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();
        String s = "juice 22;apple 12;orange 9";
        String[] s1 = s.split(";");
        for(String p : s1) {
            al.add(p);
        }
        System.out.println(al);
        HashMap<String,Integer> hm = new HashMap<>();
        for(String D : al){
            String[] c = D.split(" ");
            for(int i=0;i<2;i++){
                hm.put(c[0],Integer.parseInt(c[1]));
            }

        }
        System.out.println(hm);
        System.out.println(hm.keySet());
        int min = Integer.MAX_VALUE;
        for(String key : hm.keySet()){
            int val = hm.get(key);
            min = Math.min(min,val);
        }
        System.out.println("Minimum amount is: "+ min);
        
    }
    
}
