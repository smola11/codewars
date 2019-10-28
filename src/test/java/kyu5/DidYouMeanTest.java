package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DidYouMeanTest {

    @Test
    void findMostSimilar1() {
        DidYouMean didYouMean = new DidYouMean(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        assertEquals("java", didYouMean.findMostSimilar("heaven"));
        assertEquals("javascript", didYouMean.findMostSimilar("javascript"));
    }

    @Test
    void findMostSimilar2() {
        DidYouMean didYouMean = new DidYouMean(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        assertEquals("strawberry", didYouMean.findMostSimilar("strawbery"));
        assertEquals("cherry", didYouMean.findMostSimilar("berry"));
    }
}