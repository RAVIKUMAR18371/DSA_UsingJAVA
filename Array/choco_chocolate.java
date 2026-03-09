package Array;
import java.util.*;

public class choco_chocolate {
    static int choco(HashMap<Character, Integer> hm, String str, int m, int k) {
        int maxChocolates = 0;
        int n = str.length();

        for (int freeIndex = 0; freeIndex < 26; freeIndex++) {
            char freeChar = (char)(freeIndex + 'a');
            int currentCost = 0;
            int start = 0;
            int currentMax = 0;

            for (int end = 0; end < n; end++) {
                if (str.charAt(end) != freeChar) {
                    currentCost += hm.get(str.charAt(end));
                }

                while (currentCost > m) {
                    if (str.charAt(start) != freeChar) {
                        currentCost -= hm.get(str.charAt(start));
                    }
                    start++;
                }

                currentMax = Math.max(currentMax, end - start + 1);
            }

            maxChocolates = Math.max(maxChocolates, currentMax);
        }

        return maxChocolates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Chocolates: ");
        int n = sc.nextInt();
        System.out.println("Enter the amount of money choco has: ");
        int m = sc.nextInt();
        System.out.println("Enter the chocolate String: ");
        String s = sc.next();

        int[] costArray = {5, 4, 4, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            hm.put((char) ('a' + i), costArray[i]);
        }

        int val = choco(hm, s, m, 0);
        System.out.println(val);
    }
}
