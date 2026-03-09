package Accenture;

public class Q1 {
    static int findCount(int[] arr,int length,int num,int diff){
        int count = 0;
        for(int i = 0;i < arr.length; i++){
            if(Math.abs(arr[i] - num) < diff){
                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {12,3,14,56,77,13};
        int num = 13;
        int diff = 2;

       int val =  findCount(arr,arr.length,num,diff);
       System.out.println("The difference is: "+val);
    }
    
}
