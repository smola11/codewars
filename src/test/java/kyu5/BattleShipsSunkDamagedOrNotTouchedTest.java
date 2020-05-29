package kyu5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BattleShipsSunkDamagedOrNotTouchedTest {

    @Test
    public void example1() {
        int[][] board = new int[][]
                {
                        new int[]{0, 0, 1, 0},
                        new int[]{0, 0, 1, 0},
                        new int[]{0, 0, 1, 0}
                };
        int[][] attacks = new int[][]{new int[]{3, 1}, new int[]{3, 2}, new int[]{3, 3}};

        Map<String, Double> expected = new HashMap<>();
        expected.put("sunk", 1.0);
        expected.put("damaged", .0);
        expected.put("notTouched", .0);
        expected.put("points", 1.0);

        assertEquals(expected, BattleShipsSunkDamagedOrNotTouched.damagedOrSunk(board, attacks));
    }

    @Test
    public void example2() {
        int[][] board = new int[][]
                {
                        new int[]{3, 0, 1},
                        new int[]{3, 0, 1},
                        new int[]{0, 2, 1},
                        new int[]{0, 2, 0}
                };
        int[][] attacks = new int[][]{new int[]{2, 1}, new int[]{2, 2}, new int[]{3, 2}, new int[]{3, 3}};

        Map<String, Double> expected = new HashMap<String, Double>();
        expected.put("sunk", 1.0);
        expected.put("damaged", 1.0);
        expected.put("notTouched", 1.0);
        expected.put("points", 0.5);

        assertEquals(expected, BattleShipsSunkDamagedOrNotTouched.damagedOrSunk(board, attacks));
    }

    @Test
    public void example3() {
        int[][] board = new int[][]
                {
                        new int[]{0, 0, 0, 0, 1},
                        new int[]{0, 0, 0, 0, 1},
                        new int[]{0, 0, 0, 0, 1},
                        new int[]{0, 0, 2, 2, 0}
                };
        int[][] attacks = new int[][]{new int[]{2, 3}, new int[]{1, 2}, new int[]{1, 1}, new int[]{1, 3}, new int[]{3, 2}};

        Map<String, Double> expected = new HashMap<String, Double>();
        expected.put("sunk", 0.0);
        expected.put("damaged", 0.0);
        expected.put("notTouched", 2.0);
        expected.put("points", -2.0);

        assertEquals(expected, BattleShipsSunkDamagedOrNotTouched.damagedOrSunk(board, attacks));
    }

    @Test
    public void example4() {
        int[][] board = new int[][]
                {
                        new int[]{1, 1, 1},
                        new int[]{0, 0, 0},
                        new int[]{0, 2, 0},
                        new int[]{0, 2, 0}
                };
        int[][] attacks = new int[][]{new int[]{1, 4}, new int[]{2, 4}, new int[]{3, 4}};

        Map<String, Double> expected = new HashMap<String, Double>();
        expected.put("sunk", 1.0);
        expected.put("damaged", 0.0);
        expected.put("notTouched", 1.0);
        expected.put("points", 0.0);

        assertEquals(expected, BattleShipsSunkDamagedOrNotTouched.damagedOrSunk(board, attacks));
    }

}