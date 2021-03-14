public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        long a1000 = (long) (a * 1000);
        long b1000 = (long) (b * 1000);

        return (a1000 == b1000);
    }

    public static void testAreEqualByThreeDecimalPlaces() {
        printDecimalComparator(-3.1756D, -3.175D);
        printDecimalComparator(3.175D, 3.176D);
        printDecimalComparator(3.0D, 3.0D);
        printDecimalComparator(-3.123D, 3.123D);
    }

    private static void printDecimalComparator(double x, double y) {
        System.out.println(x +
                " " +
                (areEqualByThreeDecimalPlaces(x, y)? "is" : "is not") +
                " equal to " +
                y +
                " (up to 3 decimal places)."
        );
    }
}