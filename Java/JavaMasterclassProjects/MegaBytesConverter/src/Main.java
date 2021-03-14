public class Main {
    public static void main(String[] args) {
        int randomKB = (int) Math.floor(1000000 * Math.random());

        MegaBytesConverter.printMegaBytesAndKiloBytes(randomKB);

        MegaBytesConverter.printMegaBytesAndKiloBytes(-randomKB);

        MegaBytesConverter.printMegaBytesAndKiloBytes(0);
    }
}
