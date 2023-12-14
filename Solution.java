import java.util.Arrays;

public class Kata {
    public static long nextBiggerNumber(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        int numDigits = digits.length;

        // Find the index where the number is no longer increasing
        int i;
        for (i = numDigits - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                break;
            }
        }

        // If the number is in descending order or only one digit, return -1
        if (i == -1) {
            return -1;
        }

        // Find the smallest digit to the right of digits[i] that is greater than digits[i]
        int j;
        for (j = numDigits - 1; j > i; j--) {
            if (digits[j] > digits[i]) {
                break;
            }
        }

        // Swap digits[i] and digits[j]
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Sort the digits to the right of i in ascending order
        Arrays.sort(digits, i + 1, numDigits);

        // Convert the char array back to a long number
        long number = Long.parseLong(new String(digits));
        return number;
    }
}
