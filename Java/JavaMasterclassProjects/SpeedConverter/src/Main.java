public class Main {

    public static void main(String[] args) {
        double randomKilometersPerHour =
               1000 * Math.random();
        double invalidKilometersPerHour = -randomKilometersPerHour;
        SpeedConverter.printConversion(randomKilometersPerHour);
        SpeedConverter.printConversion(invalidKilometersPerHour);
    }
}
