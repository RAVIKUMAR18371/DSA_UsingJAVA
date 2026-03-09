package Recursion_on_String;

public class removeOccurences {
    static String v = "";
    static String occurences(String s, int i, char x){
        if(i == s.length())
            return v;
        else if(s.charAt(i) != x){
            v = v + s.charAt(i);
        }
        return occurences(s, ++i, x);
    }
    public static void main(String[] args) {
        String s = "abaaas";
        String x = occurences(s,0,'a');
        System.out.println(x);
    }
    
}
