package kyu4;

import java.util.LinkedHashMap;
import java.util.Map;

public class HumanReadableDurationFormat {

    private static final int secondsInYear = 31536000;
    private static final int secondsInDay = 86400;
    private static final int secondsInHour = 3600;
    private static final int secondsInMinute = 60;

    private static final Map<String, Integer> result = new LinkedHashMap<>();

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";

        // Determine years
        int years = seconds / secondsInYear;
        if (years > 0) {
            if (years == 1) {
                result.put("year", 1);
            } else {
                result.put("years", years);
            }
        }
        seconds = seconds - years * secondsInYear;

        // Determine days
        int days = seconds / secondsInDay;
        if (days > 0) {
            if (days == 1) {
                result.put("day", 1);
            } else {
                result.put("days", days);
            }
        }
        seconds = seconds - days * secondsInDay;

        // Determine hours
        int hours = seconds / secondsInHour;
        if (hours > 0) {
            if (hours == 1) {
                result.put("hour", 1);
            } else {
                result.put("hours", hours);
            }
        }
        seconds = seconds - hours * secondsInHour;

        // Determine minutes
        int minutes = seconds / secondsInMinute;
        if (minutes > 0) {
            if (minutes == 1) {
                result.put("minute", 1);
            } else {
                result.put("minutes", minutes);
            }
        }
        seconds = seconds - minutes * secondsInMinute;

        // Remaining seconds
        if (seconds > 0) {
            if (seconds == 1) {
                result.put("second", 1);
            } else {
                result.put("seconds", seconds);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (result.size() == 1) {
                result.clear();
                return stringBuilder.append(entry.getValue()).append(" ").append(entry.getKey()).toString();
            }
            counter++;
            stringBuilder.append(entry.getValue()).append(" ").append(entry.getKey());

            if (counter == result.size()) break;
            if (counter != result.size() - 1) {
                stringBuilder.append(",").append(" ");
            } else if (counter == result.size() - 1) {
                stringBuilder.append(" ").append("and").append(" ");
            }
        }
        result.clear();
        return stringBuilder.toString();
    }
}
