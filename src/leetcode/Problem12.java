package leetcode;

public class Problem12 {

    public static void main(String[] args) {
        // Test the method with different inputs
        System.out.println(intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println(intToRoman(58));   // Output: "LVIII"
        System.out.println(intToRoman(1994)); // Output: "MCMXCIV"
    }

    // Method to convert an integer to a Roman numeral
    public static String intToRoman(int num) {
        // Step 1: Define the Roman numeral mappings
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        // Step 2: Iterate over the mappings
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];                 // Subtract the value
                result.append(romanSymbols[i]);   // Append the Roman numeral
            }
        }

        return result.toString(); // Return the resulting Roman numeral string
    }
}
