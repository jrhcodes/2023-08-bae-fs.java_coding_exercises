package com.techreturners.exercise004;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalField;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 3, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }
    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithMonthRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 31, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 10, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithYearRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.DECEMBER, 31, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2053, Month.SEPTEMBER, 9, 1, 46, 39, 0);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkConstructorNullLocalDateException() {
        LocalDate nullDate = null;
        assertEquals(assertThrows(IllegalArgumentException.class, () -> new Exercise004(nullDate)).getMessage(), "Null LocalDate argument passed");
    }

    @Test
    public void checkConstructorNullLocalDateTimeException() {
        LocalDateTime nullDateTime = null;
        assertEquals(assertThrows(IllegalArgumentException.class, () -> new Exercise004(nullDateTime)).getMessage(), "Null LocalDateTime argument passed");
    }


}

