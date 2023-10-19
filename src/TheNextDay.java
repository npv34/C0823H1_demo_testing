package src;

public class TheNextDay {
    public static String getNextTime(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return "Data day not exactly";
        }
        int nextMonth = month;
        int nextDay = day;
        if (isaMonthHave30Day(month)) {
            if (day == 30) {
                nextDay = 1;
                nextMonth += 1;
            } else {
                nextDay = day + 1;
            }
        }else if (isaMonthHave31Day(month)) {
            if (day == 31) {
                nextDay = 1;
                nextMonth += 1;
            } else {
                nextDay = day + 1;
            }
        } else {
            if (day == 29) {
                nextDay = 1;
                nextMonth += 1;
            } else {
                nextDay += 1;
            }
        }


        return year + "-" + nextMonth + "-" + nextDay;
    }

    private static boolean isaMonthHave30Day(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }

    private static boolean isaMonthHave31Day(int month) {
        return month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
    }
}
