package onlineChallenge1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenderDeterminator {

    public String determineGender(List<String> genders, String defaultValue) {

        Set<String> setOfGenders = new HashSet<>(genders);

        if (setOfGenders.contains("M") || setOfGenders.contains("F")) {
            if (setOfGenders.containsAll(Arrays.asList("M", "F"))) {
                return defaultValue;
            } else if (setOfGenders.contains("M")) {
                return "M";
            } else {
                return "F";
            }
        }

        if (setOfGenders.contains("m") || setOfGenders.contains("f")) {
            if (setOfGenders.containsAll(Arrays.asList("m", "f"))) {
                return defaultValue;
            } else if (setOfGenders.contains("m")) {
                return "M";
            } else {
                return "F";
            }
        }
        return defaultValue;
    }
}




