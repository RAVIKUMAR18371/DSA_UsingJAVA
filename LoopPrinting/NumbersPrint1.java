package LoopPrinting;
import java.util.*;
public class NumbersPrint1 {
    static void printer(int s){
        int i = 0;
        while(i < s){
            System.out.print(i+1 + " ");
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total rows you want to print ");
        int row = sc.nextInt();
        int d = 0;
        while(d < row){
            printer(d+1);
            d++;
        }
    }
    
}
