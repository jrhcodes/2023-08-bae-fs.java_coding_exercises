package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return (word.isEmpty()) ? ""
                : Character.toUpperCase(word.charAt(0)) + (word.length() > 1 ? word.substring(1) : "");
}

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0)+ "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // had to cast to int, otherwise a rounding error occurred with one of the tests
        return ((int)(originalPrice * (100+vatRate)))/100.0;
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence)
                .reverse()
                .toString();
    }

    public long countLinuxUsers(List<User> users) {
        return users.stream()
                .filter(user -> user.getType().equals("Linux"))
                .count();
    }
}
