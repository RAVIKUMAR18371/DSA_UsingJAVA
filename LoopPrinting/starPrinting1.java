package LoopPrinting;
import java.util.*;

public class starPrinting1 {
    static void reversePrint(int d,int k){
        for(int i=0;i<k;i++){
            System.out.print(" ");
        }
        int i = 0;
        while(i < d){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
    static void printOne(int s,int p){
        for(int i = 0;i<p;i++){
            System.out.print(" ");
        }
       for(int i=s;i>0;i--){
        System.out.print("*");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("printing the stars: Take the number of row for Stars");
        int s = sc.nextInt();
        int j = 1;
        // for reversing
        int g = s/2+1;

        for(int p = 0;p < s;p+=2){
            reversePrint(p+1,g--);
        }

        // for reversing
        for(int i=s;i>0;i-=2){
            if(i == s)
                j++;
            else
              printOne(i,j++);       
        }
    }
    
}
