public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        boolean maybeLeapYear = (year > 0 && year < 10000)? true: false;

        if (maybeLeapYear) {
            // year is between 1 & 9999
            if (year % 4 == 0) {
                // year is divisible by 4
                if (year % 100 == 0) {
                    // year also is divisible by 100 so..
                    ///...check if it also divisible by 400
                    maybeLeapYear = (year % 400 == 0)? true : false;
                }
            } else {
                // year is not divisible by 4
                maybeLeapYear = false;
            }
        }

        return maybeLeapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = -1;

        if (year > 0 && year < 10000 &&
                month > 0 && month <= 12) {

            switch (month) {
                case 2:
                    daysInMonth = isLeapYear(year)?
                            29 : 28;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                default:
                    daysInMonth = 31;
            }
        }

        return daysInMonth;
    }

    public static void testGetDaysInMonth() {
        System.out.println(getDaysInMonth(1, 10000));
        System.out.println(getDaysInMonth(0, 9999));
        System.out.println(getDaysInMonth(2, 2019));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(3, 2020));
        System.out.println(getDaysInMonth(4, 2020));
        System.out.println(getDaysInMonth(5, 2020));
        System.out.println(getDaysInMonth(6, 2020));
        System.out.println(getDaysInMonth(7, 2020));
        System.out.println(getDaysInMonth(8, 2020));
        System.out.println(getDaysInMonth(9, 2020));
        System.out.println(getDaysInMonth(10, 2020));
        System.out.println(getDaysInMonth(11, 2020));
        System.out.println(getDaysInMonth(12, 2020));
        System.out.println(getDaysInMonth(13, 2020));
    }
}
