package kyu5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
    private static final String POS = "pos";
    private static final String PEAKS = "peaks";

    // arr can be empty

    // The first and last elements of the array will not be considered as peaks

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> map = createMap();

        int indexOfFirstInPlateau = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                map.get(POS).add(i);
                map.get(PEAKS).add(arr[i]);
            } else if (arr[i - 1] < arr[i] && arr[i] == arr[i + 1]){
                indexOfFirstInPlateau = i;
            } else if (indexOfFirstInPlateau != 0 && arr[i - 1] == arr[i] && arr[i] > arr[i + 1]){
                map.get(POS).add(indexOfFirstInPlateau);
                map.get(PEAKS).add(arr[indexOfFirstInPlateau]);
                indexOfFirstInPlateau = 0;
            }
        }
        return map;
    }

    private static Map<String, List<Integer>> createMap() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put(POS, new ArrayList<>());
        map.put(PEAKS, new ArrayList<>());
        return map;
    }
}