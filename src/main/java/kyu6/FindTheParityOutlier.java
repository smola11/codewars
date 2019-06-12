package kyu6;

public class FindTheParityOutlier {

    public static int find(int[] integers) {
        String FLAG;
        if (integers[0] % 2 == 0 && integers[1] % 2 == 0) FLAG = "SEARCH_ODD";
        else if (integers[0] % 2 != 0 && integers[1] % 2 != 0) FLAG = "SEARCH_EVEN";
        else {
            if (integers[2] % 2 == 0) FLAG = "SEARCH_ODD";
            else FLAG = "SEARCH_EVEN";
        }

        for (int i = 0; i < integers.length; i++) {
            int remainder = integers[i] % 2;
            if (remainder != 0 && FLAG.equals("SEARCH_ODD")){
                return integers[i];
            }
            if (remainder == 0 && FLAG.equals("SEARCH_EVEN")){
                return integers[i];
            }
        }
        return 0;
    }
}
