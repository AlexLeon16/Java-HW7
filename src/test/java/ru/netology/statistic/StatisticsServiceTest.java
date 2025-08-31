package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsInMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {5, 8, 4, 15, 3, 8, 6, 11, 11, 12};
        long expected = 15;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsLast() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {5, 8, 4, 5, 3, 8, 6, 11, 11, 20};
        long expected = 20;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {7};
        long expected = 7;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {-5, -8, -4, -1, -3, -8, -6, -11, -11, -2};
        long expected = -1;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithAllEqualNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {10, 10, 10, 10, 10, 10};
        long expected = 10;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}