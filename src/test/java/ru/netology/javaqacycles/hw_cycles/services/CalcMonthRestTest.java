package ru.netology.javaqacycles.hw_cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcMonthRestTest {

    @Test
    public void calcMonthSampleOne() {
        CalcMonthRest service = new CalcMonthRest();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;
        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcMonthSampleTwo() {
        CalcMonthRest service = new CalcMonthRest();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;
        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
