package LoopPrinting;
import java.util.*;
public class starPrint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        for(int i=0;i<row;i++){
            if(i == 0 || i == row-1){
                for(int j=0;j<row;j++){
                    System.out.print("*"+"");
                }
                System.out.println();
            }
            else{
                for(int k=0;k<row;k++){
                    if(k==0 || k==row-1){
                      System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    
                }
                System.out.println();
            }
            
        }
    }
    
}
