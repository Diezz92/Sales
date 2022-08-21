package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int amountSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int amountSalesInMonth(long[] sales) {
        return amountSales(sales) / 12;
    }


    public int numberOfMonthWhichSalesBelowAverage(long[] sales) {
        int sum = 0;
        long below = amountSalesInMonth(sales);
        for (long sale : sales) {
            if (sale < below) {
                sum++;
            }
        }
        return sum;
    }

    public int numberOfMonthWhichSalesAboveAverage(long[] sales) {
        int sum = 0;
        long below = amountSalesInMonth(sales);
        for (long sale : sales) {
            if (sale > below) {
                sum++;
            }
        }
        return sum;
    }
}

