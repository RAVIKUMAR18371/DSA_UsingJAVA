package String;
import java.util.*;

public class Reverse_The_words {
    static String reverseWords(String s, int i, String sp) {
        if (i < 0) {
            return sp;
        }
        
        // Skip leading spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        // If no more characters are left
        if (i < 0) {
            return sp;
        }
        
        // Find the end index of the current word
        int j = i;
        while (j >= 0 && s.charAt(j) != ' ') {
            j--;
        }
        
        // Extract the word and append it to the result
        String word = s.substring(j + 1, i + 1);
        if (sp.isEmpty()) {
            sp = word;
        } else {
            sp = word + " " + sp;
        }
        
        // Recursively process the rest of the string
        return reverseWords(s, j - 1, sp);
    }
    
    public static void main(String[] args) {
        String s = "The Sky is Blue";
        String reversed = reverseWords(s, s.length() - 1, "");
        System.out.println(reversed);
    }
}

