public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        String yd;

        if (minutes < 0) {
            yd = "Invalid Value";
        } else {
            long days = minutes / (24 * 60);
            long years = days / 365;
            long remainingDays = days % 365;

            yd = minutes + " min = " +
                    years + " y and " +
                    remainingDays + " d";
        }

        System.out.println(yd);
    }

    public static void testPrintYearsAndDays() {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}