package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void sumTest ()
    { StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sum(sales);
    int expected = 180;
        Assertions.assertEquals(expected, actual);}

    @Test
    public void averageTest ()
    { StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.average(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);}

    @Test
    public void maximumTest ()
    { StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maximum(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);}

    @Test
    public void minimumTest ()
    { StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minimum(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);}
    @Test
    public void lowerWhenAverageTest ()
    { StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.lowerWhenAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);}
    @Test
    public void higherWhenAverageTest ()
    { StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.higherWhenAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);}

}