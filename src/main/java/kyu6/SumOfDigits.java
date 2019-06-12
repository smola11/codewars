package kyu6;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigits {

    public static int digital_root(int n) {
        List<Integer> digits = returnDigits(n);
        int sum = 0;
        for (Integer num : digits) {
            sum += num;
        }
        if (sum > 9){
            return digital_root(sum);
        }
        return sum;
    }

    private static List<Integer> returnDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            int digit = number % 10;
            digits.add(digit);
            number = number / 10;
        }
        System.out.println(digits);
        return digits;
    }

}


