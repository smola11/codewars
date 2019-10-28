package kyu5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DidYouMean {

    private final String[] words;

    public DidYouMean(String[] words) {
        this.words = words;
    }

    // This solution is too long (poor efficiency)
    public String findMostSimilar(String to) {

        Map<Integer, String> levenshteinDistanceMap = new HashMap<>();

        for (String wordInDictionary : words) {
            int cost = calculateCost(to, wordInDictionary);
            levenshteinDistanceMap.put(cost, wordInDictionary);
        }

        int bestMatch = levenshteinDistanceMap.keySet().stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
        return levenshteinDistanceMap.get(bestMatch);
    }

    private int calculateCost(String x, String y) {
        if (x.isEmpty()) return y.length();
        if (y.isEmpty()) return x.length();

        // 3 possible options
        int substitution = calculateCost(x.substring(1), y.substring(1))
            + costOfSubstitution(x.charAt(0), y.charAt(0));
        int insertion = calculateCost(x, y.substring(1)) + 1;
        int deletion = calculateCost(x.substring(1), y) + 1;

        return min(substitution, insertion, deletion);
    }


    private int costOfSubstitution(char a, char b) {
        return a == b ? 0 : 1;
    }

    private int min(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }


}
