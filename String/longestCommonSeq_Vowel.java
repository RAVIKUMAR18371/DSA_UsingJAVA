package String;
import java.util.*;

public class longestCommonSeq_Vowel {
   static List<Character> al = List.of('A','E','I','O','U','a','e','i','o','u');
   static List<Character> ll = new ArrayList<>(al);
    
   // Recursive function to find the longest common sequence of vowels
    static int longCommVowel(String s1, String s2, int i, int j){
        
        // Base case: if either index goes below 0, return 0
        if(i < 0 || j < 0){
            return 0;
        }
        
        char x = s1.charAt(i);
        char y = s2.charAt(j);

        // If characters at i and j are the same and are vowels
        if(x == y && ll.contains(x)){
            return 1 + longCommVowel(s1, s2, i-1, j-1);
        }

        // Recursive calls to explore all options
        return Math.max(longCommVowel(s1, s2, i-1, j), longCommVowel(s1, s2, i, j-1));
    }

    public static void main(String[] args) {
        String s1 = "vowelpunish";
        String s2 = "english";
    
        // Capture and print the result
        int result = longCommVowel(s1, s2, s1.length()-1, s2.length()-1);
        System.out.println("The length of the longest common sequence of vowels is: " + result);
    }
}
