package kyu4;

import java.util.Arrays;

public class NextBiggerNumberWithTheSameDigits {

    public static long nextBiggerNumber(long n) {

        int[] digits = getDigits(n);

        int i = checkIfNextBiggerNumberExists(digits);
        if (i == 0) {
            System.out.println("Bigger number does not exist");
            return -1;
        } else {
            int stopDigit = digits[i - 1];
            int min = i;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[j] > stopDigit && digits[j] < digits[min]) {
                    min = j;
                }
            }
            swap(digits, i - 1, min);
            Arrays.sort(digits, i, digits.length);
        }
        return getFinalNumberFromArray(digits);
    }

    private static int[] getDigits(long n) {
        int[] digits = new int[Long.valueOf(n).toString().length()];
        int index = digits.length - 1;
        while (n > 0) {
            int digit = (int) (n % 10);
            digits[index] = digit;
            n /= 10;
            index--;
        }
        return digits;
    }

    private static int checkIfNextBiggerNumberExists(int[] digits) {
        int i;
        for (i = digits.length - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) {
                break;
            }
        }
        return i;
    }

    private static void swap(int[] digits, int i, int min) {
        int temp = digits[i];
        digits[i] = digits[min];
        digits[min] = temp;
    }

    private static Long getFinalNumberFromArray(int[] digits) {
        StringBuilder numberToReturn = new StringBuilder();
        for (int digit : digits) {
            numberToReturn.append(digit);
        }
        return Long.valueOf(numberToReturn.toString());
    }

}
