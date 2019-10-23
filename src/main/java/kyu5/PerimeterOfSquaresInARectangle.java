package kyu5;

import java.math.BigInteger;

public class PerimeterOfSquaresInARectangle {

    private static BigInteger sum = BigInteger.ZERO;
    private static BigInteger currentNumber = BigInteger.ONE;
    private static BigInteger nextNumber = BigInteger.ONE;


    public static BigInteger perimeter(BigInteger n) {
        if (n.intValue() <= 1) return n;

        while (n.compareTo(BigInteger.ZERO) != 0) {
            sum = sum.add(currentNumber);
            BigInteger temp = new BigInteger(String.valueOf(currentNumber));
            currentNumber = nextNumber.abs();
            nextNumber = nextNumber.add(temp);
            n = n.subtract(BigInteger.valueOf(1));
        }
        sum = sum.add(currentNumber);
        return sum.multiply(new BigInteger("4"));
    }
}
