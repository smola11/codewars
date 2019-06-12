package kyu5;

public class AirportArrivalsDepartures {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {

        String[] result = new String[lines.length];

        for (int i = 0; i < lines.length; i++) {
            String word = lines[i];
            int[] rotor = rotors[i];
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = word.toCharArray();
            for (int k = 0; k < chars.length; k++) {
                for (int j = 0; j < rotor.length; j++) {
                    chars[j] = getNextCharacter(chars[j], rotor[k]);
                }
                stringBuilder.append(chars[k]);
            }
            result[i] = stringBuilder.toString();
        }
        return result;
    }

    private static char getNextCharacter(char currentChar, int rotate) {
        int currentIndex = ALPHABET.indexOf(currentChar);
        int sumOfIndexAndRotate = currentIndex + rotate;
        while (sumOfIndexAndRotate >= ALPHABET.length()) {
            sumOfIndexAndRotate = sumOfIndexAndRotate - ALPHABET.length();
        }
        return ALPHABET.charAt(sumOfIndexAndRotate);
    }
}
