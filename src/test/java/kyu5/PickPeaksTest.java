package kyu5;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PickPeaksTest {

    @Test
    void caseOne() {
        // Given
        int[] arr = new int[]{0, 1, 2, 5, 1, 0};

        // When/Then
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("pos", Collections.singletonList(3));
        map.put("peaks", Collections.singletonList(5));

        assertEquals(map, PickPeaks.getPeaks(arr));

    }

    @Test
    void caseTwo() {
        // Given
        int[] arr = new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3};

        // When/Then
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("pos", Arrays.asList(3, 7));
        map.put("peaks", Arrays.asList(6, 3));

        assertEquals(map, PickPeaks.getPeaks(arr));

    }

    @Test
    void caseThree() {
        // Given
        int[] arr = new int[]{1,2,2,2,1};

        // When/Then
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("pos", Collections.singletonList(1));
        map.put("peaks", Collections.singletonList(2));

        assertEquals(map, PickPeaks.getPeaks(arr));

    }
}