package LoopPrinting;
import java.util.*;
public class starPrint2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        int row = sc.nextInt();
        System.out.println();
        int num = 1;

        for(int i=0;i<row;i++){
            for(int j = 0; j <= i;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
       
            
        
        sc.close();
    }
    
}
