package onlineChallenge1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DomainParser {

    public static final String DOMAIN = "https?:\\/\\/w?w?w?\\.?([^\\/\\\"]*)";
    private final Map<String, Integer> domains = new HashMap<>();

    public String extract(String HTML_code) {

        Pattern pattern = Pattern.compile(DOMAIN);
        Matcher matcher = pattern.matcher(HTML_code);

        while (matcher.find()) {
            String domain = matcher.group(1);
            domains.compute(domain, (key, value) -> value == null ? 1 : ++value);
        }

        Map<String, Integer> domainsDescSorted = domains
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                        LinkedHashMap::new));

        return domainsDescSorted
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining(", "));
    }
}




