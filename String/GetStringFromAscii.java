package String;
import java.util.*;

public class GetStringFromAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Value:");
        String str = sc.nextLine();

        // Assuming the input is a sequence of ASCII values as a string
        // We will convert every two characters (which form a number) back to the character

        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                // Get the ASCII value formed by two characters
                String asciiStr = str.substring(i, i + 2);
                int asciiValue = Integer.parseInt(asciiStr);

                // Convert the ASCII value to a character
                char character = (char) asciiValue;
                result.append(character);
            }
        }

        System.out.println("The resulting string is: " + result.toString());
        sc.close();
    }
}
