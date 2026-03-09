package Array;
import java.util.*;

public class nextGreatest {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        System.out.println(arr[1]);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        System.out.println(hm);

        for(int i=0;i<arr.length;i++){
            HashMap<Integer,Integer> hs = new HashMap<>(hm);
          //  while(hs.con)){
                if(hs.containsKey(arr[i]));

            }
        }
        
       
    }
    

