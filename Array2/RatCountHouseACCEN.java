package Array2;
import java.util.*;
public class RatCountHouseACCEN {
    static int ratCount(int r, int unit, int[] arr){
        if(arr==null){
            return -1;
        }
        int totalConsumption_Rat_At_index = 0;
        // r --> represent the number of rat present in that area
        // unit --> represent the consunption of each rat in that particular area

        totalConsumption_Rat_At_index = r * unit;
        int p = 0;
        int countHouse = 1;
        int val = arr[0];
        while(val <= totalConsumption_Rat_At_index){
            countHouse = countHouse + 1;
            val = val + arr[p++];
        }

        return countHouse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take the value of--> R: ");
        int r = sc.nextInt();
        System.out.println("Take the values of--> unit");
        int unit = sc.nextInt();
        int[] arr = {2,8,3,5,7,4,1,2};
        int val = ratCount(r, unit, arr);
        System.out.println("Total house it include: "+val);
    }
    
}
