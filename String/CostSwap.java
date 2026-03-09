package String;

public class CostSwap {

    static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    static char[] costSwap(char[] s, int totalCost, int swapCost, int flipCost) {
        int n = s.length;

        // Perform flips first since flipCost is generally less than swapCost
        for (int i = 0; i < n; i++) {
            if (s[i] == '1' && totalCost >= flipCost) {
                s[i] = '0';
                totalCost -= flipCost;
            }
        }

        // Perform swaps if there is still some totalCost left
        if (totalCost >= swapCost) {
            for (int i = 0; i < n; i++) {
                if (s[i] == '1') {
                    for (int j = 0; j < n; j++) {
                        if (s[j] == '0' && totalCost >= swapCost) {
                            swap(s, i, j);
                            totalCost -= swapCost;
                        }
                    }
                }
            }
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "111011";
        int totalCost = 7;
        int swapCost = 3;
        int flipCost = 2;
        char[] c = s.toCharArray();

        char[] result = costSwap(c, totalCost, swapCost, flipCost);
        String modifiedString = new String(result);

        int value = Integer.parseInt(modifiedString, 2);
        System.out.println(value);
    }
}
