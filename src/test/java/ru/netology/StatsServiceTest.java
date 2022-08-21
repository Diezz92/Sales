package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    public void MinSalesMonth () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MaxSalesMonth () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void AmountOfTheSales () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.amountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void AmountOfTheSalesInMonth () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.amountSalesInMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void NumberOfMonthWhichSalesBelowAverage () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.numberOfMonthWhichSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void NumberOfMonthWhichSalesAboveAverage () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.numberOfMonthWhichSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
