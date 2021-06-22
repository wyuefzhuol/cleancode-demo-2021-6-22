package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {
    private static final int MIN_EIGHTY_PERCENT_EXPENSES = 100;
    private static final double EIGHTY_PERCENT = 0.8;
    private static final int MIN_FIFTY_PERCENT_EXPENSES = 150;
    private static final double FIFTY_PERCENT = 0.5;
    private static final int MAX_FIFTY_PERCENT_EXPENSES = 400;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= MIN_EIGHTY_PERCENT_EXPENSES && cumulativeExpensesThisMonth < MIN_FIFTY_PERCENT_EXPENSES) {
            return originalPrice * EIGHTY_PERCENT;
        }
        if (cumulativeExpensesThisMonth >= MIN_FIFTY_PERCENT_EXPENSES && cumulativeExpensesThisMonth < MAX_FIFTY_PERCENT_EXPENSES) {
            return originalPrice * FIFTY_PERCENT;
        }
        return originalPrice;
    }
}
