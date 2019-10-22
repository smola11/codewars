package kyu5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IsMyFriendCheating {

    public static List<long[]> removNb(long n) {

        long sum = (n * n + n) / 2;

        LinkedList<long[]> numbers = new LinkedList<>();
        for (long current = 1; current < n; current++) {
            double b = (sum - current) / (double) (current + 1);
            if (b <= n && b % 1 == 0) {
                long[] pair = new long[]{current, (long) b};
                numbers.add(pair);
            }
        }
        numbers.forEach(a -> Arrays.stream(a).forEach(System.out::println));
        return numbers;
    }
}
