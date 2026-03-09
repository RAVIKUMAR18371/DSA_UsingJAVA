package COGNIZANT;
import java.util.*;
public class fuelConsumption {
    static void fueler(int fuel, int distance){
        if(fuel < 0 || distance < 0){
            System.out.println("The statement is invalid");
            return;
        }
        System.out.printf("100 km fuel consumption would be: %.2f", (double)fuel/distance * 100);
        System.out.printf("\nMiles per gallons");
        double convert_To_miles = distance * 0.6214;
        double convert_to_gallon = fuel * 0.2642;
        System.out.printf("Miles per gallons: %.2f", convert_To_miles/convert_to_gallon);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // fuel consumption --> question
        System.out.println("Enter the fuel you want to fill");
        int fuel = sc.nextInt();
        System.out.println("Enter the Distance you want to travel to");
        int distance = sc.nextInt();

        fueler(fuel,distance);
    }
    
}
