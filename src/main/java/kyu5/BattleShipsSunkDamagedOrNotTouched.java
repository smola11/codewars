package kyu5;

import java.util.*;

public class BattleShipsSunkDamagedOrNotTouched {

    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {

        double sunk = 0.0;
        Set<Integer> damagedShips = new HashSet<>();
        Map<Integer, Integer> shipsHealth = getShips(board);

        for (int[] attack : attacks) {
            int horizontalAttack = attack[0] - 1;
            int verticalAttack = board.length - attack[1];

            int pointAttacked = board[verticalAttack][horizontalAttack];
            if (pointAttacked == 1 || pointAttacked == 2 || pointAttacked == 3) {
                shipsHealth.put(pointAttacked, shipsHealth.get(pointAttacked) - 1);
                if (shipsHealth.get(pointAttacked) != 0) {
                    damagedShips.add(pointAttacked);
                } else {
                    sunk++;
                    damagedShips.remove(pointAttacked);
                }
            }
        }


        double notTouched = 0.0;
        for (Integer ship : damagedShips) {
            shipsHealth.remove(ship);
        }
        for (Integer shipHealth : shipsHealth.values()) {
            if (shipHealth != 0) {
                notTouched++;
            }
        }

        Map<String, Double> score = new HashMap<>();
        score.put("sunk", sunk);
        score.put("damaged", (double) damagedShips.size());
        score.put("notTouched", notTouched);
        score.put("points", score.get("sunk") + score.get("damaged") * 0.5 - notTouched);
        return score;
    }

    private static Map<Integer, Integer> getShips(int[][] board) {
        Map<Integer, Integer> ships = new HashMap<>();
        for (int[] horizontal : board) {
            for (int value : horizontal) {
                switch (value) {
                    case 1:
                        ships.put(1, ships.getOrDefault(1, 0) + 1);
                        continue;
                    case 2:
                        ships.put(2, ships.getOrDefault(2, 0) + 1);
                        continue;
                    case 3:
                        ships.put(3, ships.getOrDefault(3, 0) + 1);
                }
            }
        }
        return ships;
    }
}
