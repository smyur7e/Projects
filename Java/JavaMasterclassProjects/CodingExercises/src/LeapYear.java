public class LeapYear {

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

    public static void testIsLeapYear() {
        printLeapYear(-1);
        printLeapYear(0);
        printLeapYear(10000);
        printLeapYear(1);
        printLeapYear(4);
        printLeapYear(9996);
        printLeapYear(9999);
        printLeapYear(1600);
        printLeapYear(1700);
        printLeapYear(1800);
        printLeapYear(1900);
        printLeapYear(1984);
        printLeapYear(2000);
        printLeapYear(2100);
        printLeapYear(2200);
        printLeapYear(2300);
        printLeapYear(2400);
        printLeapYear(2500);
        printLeapYear(2600);
    }

    private static void printLeapYear(int year) {
        System.out.println(year +
                " " +
                (isLeapYear(year)? "is" : "is not") +
                " a leap year"
        );
    }
}
