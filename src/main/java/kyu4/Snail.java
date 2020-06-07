package kyu4;

import java.util.ArrayList;
import java.util.List;

public class Snail {

    public static int[] snail(int[][] array) {

        if (array.length == 1 && array[0].length == 0) return new int[]{};

        List<Integer> result = new ArrayList<>();
        int startingRowIndex = 0;
        int endingRowIndex = array.length - 1;
        int startingColumnIndex = 0;
        int endingColumnIndex = array.length - 1;

        while (startingRowIndex <= endingRowIndex && startingColumnIndex <= endingColumnIndex) {
            // Print the first row from the remaining rows
            for (int i = startingColumnIndex; i <= endingColumnIndex; i++) {
                result.add(array[startingRowIndex][i]);
            }
            startingRowIndex++;

            // Print the last column from the remaining columns
            for (int i = startingRowIndex; i <= endingRowIndex; i++) {
                result.add(array[i][endingRowIndex]);
            }
            endingColumnIndex--;

            // Print the last row from the remaining rows
            for (int i = endingColumnIndex; i >= startingColumnIndex; i--) {
                result.add(array[endingRowIndex][i]);
            }
            endingRowIndex--;

            // Print the first column from the remaining columns
            for (int i = endingRowIndex; i >= startingRowIndex; i--) {
                result.add(array[i][startingColumnIndex]);
            }
            startingColumnIndex++;
        }

        Integer[] ints = result.toArray(new Integer[0]);
        int[] finalResult = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            finalResult[i] = ints[i];
        }
        return finalResult;
    }
}
