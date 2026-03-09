package Array;

import java.util.Arrays;

public class candyRating {
    public static void main(String[] args) {
        int sum = 0;
        int[] candies = {1, 1, 1, 1, 1, 1, 1, 1,1,1};
        int[] rating = {2, 4, 2, 6, 1, 7, 8, 9, 2, 1};
        for(int i=1;i<rating.length;i++) {
            if(rating[i-1]  >= rating[i]){
                candies[i] = candies[i-1]+1;
                System.out.println("candies "+candies[i]);
            }
        }
        for(int i=0;i<candies.length;i++){
            sum = sum + candies[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(candies));
    }
    
}
