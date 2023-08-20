package com.techreturners.exercise005;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @BeforeEach
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }


    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }


    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }


    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }
    @Test
    public void checkSentenceWithMissingLetterIsNotPangramAToZ() {

        // tried to use @ValueSource and @ParameterizedTest, but I think my version of Java is too old :/
        // so used a loop/array instead
        final String [] testInput = { // each row is missing on letter
                "bcdefghijklmnopqrstuvwxyz",
                "acdefghijklmnopqrstuvwxyz",
                "abdefghijklmnopqrstuvwxyz",
                "abcefghijklmnopqrstuvwxyz",
                "abcdfghijklmnopqrstuvwxyz",
                "abcdeghijklmnopqrstuvwxyz",
                "abcdefhijklmnopqrstuvwxyz",
                "abcdefgijklmnopqrstuvwxyz",
                "abcdefghjklmnopqrstuvwxyz",
                "abcdefghiklmnopqrstuvwxyz",
                "abcdefghijlmnopqrstuvwxyz",
                "abcdefghijkmnopqrstuvwxyz",
                "abcdefghijklnopqrstuvwxyz",
                "abcdefghijklmopqrstuvwxyz",
                "abcdefghijklmnpqrstuvwxyz",
                "abcdefghijklmnoqrstuvwxyz",
                "abcdefghijklmnoprstuvwxyz",
                "abcdefghijklmnopqstuvwxyz",
                "abcdefghijklmnopqrtuvwxyz",
                "abcdefghijklmnopqrsuvwxyz",
                "abcdefghijklmnopqrstvwxyz",
                "abcdefghijklmnopqrstuwxyz",
                "abcdefghijklmnopqrstuvxyz",
                "abcdefghijklmnopqrstuvwyz",
                "abcdefghijklmnopqrstuvwxz",
                "abcdefghijklmnopqrstuvwxy"
        };

        for (String ch : testInput) {
            assertFalse(ex005.isPangram(ch.toLowerCase())); // looped rather than stream so error point can be detected with debug
            assertFalse(ex005.isPangram(ch.toUpperCase())); // tried to use
        }

    }

    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }


    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

}
