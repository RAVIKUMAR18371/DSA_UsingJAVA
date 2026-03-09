package GreedyApproach;
import java.util.*;

public class largest_numPalin {
    public static void main(String[] args) {
        String s = "3135512";
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        
        // Convert string characters to integers and add to list
        for (int i = 0; i < s.length(); i++) {
            al.add(s.charAt(i) - '0');
        }
        System.out.println(al);
        
    for(int i=0;i<al.size();i++){
        if(hm.containsKey(al.get(i))){
             hm.put(al.get(i),hm.get(al.get(i))+1);
        }
        else{
            hm.put(al.get(i), 1);
        }
    }
    System.out.println(hm);
    
    System.out.println("The values will be" + hm.values());

    if(!(validate(al))){
        System.out.println("Palindrome not Pssible");
    }
    else{
        for(int i=0;i<al.size();i++){

        }
    }

    

    
}
private static boolean validate(List<Integer> freq){
    boolean isOdd = false;
    for(int i=0; i < freq.size(); i++){
        if(freq.get(i) % 2 != 0){
            if(isOdd == true){
                return false;
            }
            isOdd = true; // 1 odd number is ok
        }
    }
    return true;
}

}
