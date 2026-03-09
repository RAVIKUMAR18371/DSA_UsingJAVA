package Accenture;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,1,7,5,4};
        System.out.println("Enter which largest or smallest element you want at index: ");
        int p = sc.nextInt();
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> ll = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            if(i % 2 == 0){
                al.add(Integer.valueOf(arr[i]));// for Even
            }
            if(i % 2 != 0){
                ll.add(arr[i]); // for Odd
            }
        }
        int val = al.get(p-1) + ll.get(p-1);
        System.out.printf("The %d largest and %d smallest number sum will be: %d",p,p,val);
    }
    
}
