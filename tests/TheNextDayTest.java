package tests;
import org.junit.Test;
import src.TheNextDay;

import static org.junit.Assert.assertEquals;

public class TheNextDayTest {

    @Test
    public void testInputDayNotExactlyWithLessThanMin() {
        int day = 0;
        int month = 3;
        int year = 2023;

        String expected = "Data day not exactly";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayNotExactlyWithBiggerThanMax() {
        int day = 32;
        int month = 3;
        int year = 2023;

        String expected = "Data day not exactly";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayExactlyMinWithCommonYear() {
        int day = 1;
        int month = 1;
        int year = 2023;

        String expected = "2023-1-2";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 4;
        int year = 2023;

        String expected = "2023-5-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 6;
        int year = 2023;

        String expected = "2023-7-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test3InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 9;
        int year = 2023;

        String expected = "2023-10-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 1;
        int year = 2023;

        String expected = "2023-2-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 3;
        int year = 2023;

        String expected = "2023-4-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test3InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 5;
        int year = 2023;

        String expected = "2023-6-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayExactlyMin31WithCommonYear() {
        int day = 1;
        int month = 5;
        int year = 2023;

        String expected = "2023-5-2";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayMaxOfMonthFebruaryWithCommonYear() {
        int day = 29;
        int month = 2;
        int year = 2023;

        String expected = "Data day not exactly";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayMinOfMonthFebruaryWithCommonYear() {
        int day = 1;
        int month = 2;
        int year = 2023;

        String expected = "2023-2-2";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayMinOfMonthFebruaryWithLeapYear() {
        int day = 1;
        int month = 2;
        int year = 2024;

        String expected = "2024-2-2";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }


    @Test
    public void testInputDayMaxOfMonthFebruaryWithLeapYear() {
        int day = 28;
        int month = 2;
        int year = 2024;

        String expected = "2024-3-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
}
