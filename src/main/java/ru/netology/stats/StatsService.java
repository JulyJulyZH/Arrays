package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int maximum(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth+1;
    }

    public int minimum(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth+1;
    }

    public int lowerWhenAverage(int sales[]) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int higherWhenAverage(int sales[]) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}