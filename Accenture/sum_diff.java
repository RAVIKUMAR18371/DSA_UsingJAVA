package Accenture;
import java.util.*;
public class sum_diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the upto the number you want to take");
        int val = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        for(int i=1;i<=val;i++){
            if(i%n == 0){
                count1 = count1 + i;
            }
            if(i%n != 0){
                count2 = count2 + i;
            }
        }
        System.out.println("The difference is: ");
        System.out.println(Math.abs(count1 - count2));
    }
    
}
