package com.techreturners.exercise005;

import java.util.*;

public class Exercise005 {

    public boolean isPangram(String input) {

        final String lowerCaseInput = input.toLowerCase();
        final String[] alphabet = "zjxqkvbgpwyfcmuldrhainoste".split("");   //sorted in order of ascending frequency in the English Language
        return Arrays.stream(alphabet).allMatch(lowerCaseInput::contains);
    }
}
