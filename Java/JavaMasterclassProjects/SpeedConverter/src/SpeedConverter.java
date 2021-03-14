public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1L;
        }

        return Math.round(kilometersPerHour / 1.609D);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour +
                    " km/h = " + toMilesPerHour(kilometersPerHour) +
                    " mi/h");
        }
    }
}