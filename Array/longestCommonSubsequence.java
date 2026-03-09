package Array;

public class longestCommonSubsequence {
    static int answer = 0;
   static int calls = 0;
    static int longest_Common_subsequence(String s1, String s2, int i, int j, int[][] dp){
        calls++;
        if(i == s1.length()){
            return 0;
        }
        if(j == s2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            answer = 1 + longest_Common_subsequence(s1, s2, i+1, j+1 , dp);
        }
        else{
            int value = longest_Common_subsequence(s1, s2, i+1, j, dp);
            int val = longest_Common_subsequence(s1, s2, i, j+1, dp);
            answer = Math.max(value , val);
            dp[i][j] = answer;
        }
        return answer;

    }
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ACE";
        int[][] dp = new int[s1.length()][s2.length()];
        for(int i=0;i < s1.length(); i++){
            for(int j=0;j<s2.length();j++){
                dp[i][j] = -1;
            }
        }
        int value = longest_Common_subsequence(s1, s2, 0, 0 , dp);
        System.out.println("The longest common subsequence is: "+ value);
        System.out.println("The number of calls: "+calls);
    }
    
}
