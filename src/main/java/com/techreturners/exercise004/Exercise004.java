package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Exercise004 {

    private final LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        dateTime = calcFutureTime(date.atStartOfDay());
    }

    public Exercise004(LocalDateTime initDateTime) {
        dateTime = calcFutureTime(initDateTime);
    }

    private LocalDateTime calcFutureTime(LocalDateTime baseDateTime) {
        final long gigaSecond = 1_000_000_000L;
        return baseDateTime.plusSeconds(gigaSecond);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

}
