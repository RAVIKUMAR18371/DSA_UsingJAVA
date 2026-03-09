package LoopPrinting;
import java.util.Scanner;

public class DiamondPattern {

    static void printer(int left, int stars, int right) {
        // Print left side of the numbers
        for (int i = 7; i > 7 - left; i--) {
            System.out.print(i);
        }
        // Print stars
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        // Print right side of the numbers
        for (int i = 7 - right + 1; i <= 7; i++) {
            System.out.print(i);
        }
        System.out.println(); // Move to the next line
    }

    public static void main(String[] args) {
        int n = 7; // Since the pattern is symmetrical and based on 7

        int mid = n / 2; // Middle index for symmetric pattern
        int stars = 6; // Starting with 6 stars in the first row
        
        // Top half of the pattern including the middle row
        for (int i = 0; i <= mid; i++) {
            int leftNumbers = i + 1;
            int rightNumbers = i + 1;
            printer(leftNumbers, stars, rightNumbers);
            stars -= 2; // Reduce the number of stars
        }

        // Bottom half of the pattern (mirror image of the top half)
        stars = 2; // Start from 2 stars after the middle
        for (int i = mid - 1; i >= 0; i--) {
            int leftNumbers = i + 1;
            int rightNumbers = i + 1;
            printer(leftNumbers, stars, rightNumbers);
            stars += 2; // Increase the number of stars
        }
    }
}
