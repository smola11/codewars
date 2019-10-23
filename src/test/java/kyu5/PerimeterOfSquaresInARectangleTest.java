package kyu5;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class PerimeterOfSquaresInARectangleTest {


    @Test
    void perimeterBig() {
        PerimeterOfSquaresInARectangle.perimeter(new BigInteger("7"));
    }
}