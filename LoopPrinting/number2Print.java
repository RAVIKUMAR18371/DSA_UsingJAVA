package LoopPrinting;
import java.util.*;
public class number2Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        int n = sc.nextInt();
        List<String> ll = new ArrayList<String>();
        List<List<String>> al = new ArrayList<>();
        int num = 2;
        int temp = n;
        // firstly
        for(int i = 0;i<n/2;i++){
            for(int j = 0;j<=i;j++){
               ll.add(""+num++);
            }
        //   al.add(ll.toString());
        }
        for(int i = al.size()-1;i>=0;i--){
            al.add(al.get(i));
        }

        // Now printing
        for(List<String> al2 : al){
            System.out.println(al2);
        }
    }
    
}
