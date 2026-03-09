package String;

public class highestDiff {
    static int higDiff(int[] arr){
        int maxi = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    int value = arr[j]-arr[i];
                    maxi = Math.max(maxi,value);
                }
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        int[]  arr =  {7, 9, 5, 6, 3, 2};
        int val = higDiff(arr);
        System.out.println(val);
    }
    
}
