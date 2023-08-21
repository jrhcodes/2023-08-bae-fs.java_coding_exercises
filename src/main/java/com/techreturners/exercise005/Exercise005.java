package com.techreturners.exercise005;

import java.util.*;



public class Exercise005 {

    private final static String ALPHABET_SORTED = "zjxqkvbgpwyfcmuldrhainoste"; // sorted in order of ascending frequency in the English Language
    private final static String[] ALPHABET_ARRAY  = ALPHABET_SORTED.split("");
    public boolean isPangram(String input) {

        if (input == null)
            throw new IllegalArgumentException("Null string argument passed");

        final String lowerCaseInput = input.toLowerCase();

        return Arrays.stream(ALPHABET_ARRAY).allMatch(lowerCaseInput::contains);
    }
}
