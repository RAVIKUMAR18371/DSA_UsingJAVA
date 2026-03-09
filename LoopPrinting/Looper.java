package LoopPrinting;
import java.util.*;
public class Looper {
    static void loopest(int n,int d,int s){
        for(int i=0;i < d;i++){
            System.out.print(" ");
        }
        for(int i=0;i<s;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    static void looping(int n,int d,int s){
        for(int i=0;i<d;i++){
            System.out.print(" ");
        }
        for(int i=0;i<s;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows");
     int n = sc.nextInt();

     int d = n-1;
     int q = 1;
     int s = 1;

     for(int i=0;i<n;i++){
        if(i != 0){
            s = s + 2;
        }
        loopest(n,d--,s);
     }

     
     s = s-2;

     for(int i=0;i<n;i++){
        if(i != 0){
            s = s - 2;
        }
          looping(n, q++, s);
     }
}
}
