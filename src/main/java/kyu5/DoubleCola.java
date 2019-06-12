package kyu5;

import java.util.ArrayList;
import java.util.List;

class DoubleCola {

    private static List<String> namesMultiplied = new ArrayList<>();

    static String whoIsNext(String[] names, int n) {
        if (n < names.length) return names[n];

        int multiplyingFactor = 1;
        int colNumber = n;
        while (colNumber > 0) {
            for (String name : names) {
                addNameNtimes(multiplyingFactor, name);
            }
            System.out.println(namesMultiplied);
            multiplyingFactor += 1;
            colNumber--;
        }

        return namesMultiplied.get(n - 1);
    }

    private static void addNameNtimes(int n, String name) {
        while (n > 0) {
            namesMultiplied.add(name);
            n--;
        }
    }
}
