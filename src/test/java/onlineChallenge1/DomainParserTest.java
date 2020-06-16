package onlineChallenge1;

import org.junit.jupiter.api.Test;

class DomainParserTest {

    @Test
    void extract() {
        String HTML = new String(
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<body>" +
                        "<a href=\"https://www.domain_test_1.it\">Some link</a>" +
                        "<a href=\"http://domain_test_1.it/subpage\">Another link</a>" +
                        "<div>" +
                        "<img src=\"https://another-domain.ru/img.jpg\">" +
                        "</div>" +
                        "</body>" +
                        "</html>");

        String correct_answer = new String("domain_test_1.it: 2, another-domain.ru: 1");
        DomainParser app = new DomainParser();
        assert correct_answer.equals(app.extract(HTML));
    }
}