package kyu5;

import java.util.StringJoiner;

public class SimplePigLatin {

    public static String pigIt(String pig_latin_is_cool) {
        String[] words = pig_latin_is_cool.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].matches("[a-zA-Z]+")) {
                stringJoiner.add(words[i]);
            } else {
                String word = words[i];
                String newWord = word.substring(1, word.length()) + word.charAt(0) + "ay";
                stringJoiner.add(newWord);
            }
        }
        return stringJoiner.toString();
    }
}
