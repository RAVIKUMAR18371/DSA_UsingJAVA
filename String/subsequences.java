package String;

import java.util.Arrays;

public class subsequences {

    static void subSequences(char[] c, String s, String[] n) {
        int p = 0;
        for(int i=0; i < ((1 << s.length()) -1); i++){
            StringBuilder ss = new StringBuilder();
            for(int j=0;j<s.length();j++){
                if((i & 1 << j)>0){
                    ss.append(s.charAt(j));
                }
            }
          //  n[p] = ss;
            p = p+1;
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        char[] c = s.toCharArray();
        String[] N = new String[(int) (Math.pow(2, s.length()) - 1)];
        subSequences(c, s, N);
    }
}

