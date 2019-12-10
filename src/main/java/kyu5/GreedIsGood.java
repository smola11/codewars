package kyu5;

import java.util.HashMap;
import java.util.Map;

class GreedIsGood {

//    Rules:
//    Three 1's => 1000 points
//    Three 6's =>  600 points
//    Three 5's =>  500 points
//    Three 4's =>  400 points
//    Three 3's =>  300 points
//    Three 2's =>  200 points
//    One   1   =>  100 points
//    One   5   =>   50 point


    public static int greedy(int[] dice) {
        Map<Integer, Integer> scores = collectScores(dice);
        int scoreSum = 0;
        for (Map.Entry<Integer, Integer> score : scores.entrySet()) {
            DiceCalulator diceCalulator = new DiceCalulator(score.getKey(), score.getValue());
            scoreSum += diceCalulator.calculateScore();
        }
        return scoreSum;
    }

    private static Map<Integer, Integer> collectScores(int[] dice) {
        Map<Integer, Integer> scores = new HashMap<>();
        for (int score : dice) {
            scores.merge(score, 1, Integer::sum);
        }
        return scores;
    }

    private static class DiceCalulator {
        private final int score;
        private int times;


        DiceCalulator(int score, int times) {
            this.score = score;
            this.times = times;
        }

        int calculateScore() {
            int totalDiceScore = 0;
            if (times >= 3) {
                if (score == 1) {
                    totalDiceScore += 1000;
                } else {
                    totalDiceScore += score * 100;
                }
                times -= 3;
            }
            if (score == 1) {
                totalDiceScore += 100 * times;
            }
            if (score == 5) {
                totalDiceScore += 50 * times;
            }
            return totalDiceScore;
        }
    }
}
