package COGNIZANT;
import java.util.*;
public class passwordchecker {
   static Stack<Character> stack = new Stack<Character>();
   static Stack<Integer> stack2 = new Stack<Integer>();
   static Stack<Integer> stack3 = new Stack<Integer>();
   static int count = 0;
    static void checker(String password){
        if(password.length() < 4){
            return;
        }
        for(int i=0;i<password.length();i++){
            stack.push(password.charAt(i));
        }
        for(int i=0;i<stack.size();i++){
            if(Character.isDigit(stack.get(i))){
                count++;
            }
        }
        if(stack.contains('/') || stack.contains(' ')){
            return;
        }
        for(int i = 0;i<password.length();i++){
            int val = password.charAt(i);
                stack2.push(val);
        }

        }
        

    public static void main(String[] args) {
        String password = "aA1_67";

        checker(password);

    }
    
}
