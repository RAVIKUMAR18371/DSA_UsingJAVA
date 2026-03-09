package GreedyApproach;
import java.util.*;
public class permutation {
    public static void main(String[] args) {
        String number = "313551";
        List<Integer> freq = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            freq.add(0);
        }
        int n = number.length();
        for(int i=0; i<n; i++){
            int digit = number.charAt(i) - '0';
            freq.set(digit, freq.get(digit) + 1);
        }
        System.out.println(freq);
    
    if(!(validate(freq))){
        System.out.println("Palindrome not Pssible");
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
