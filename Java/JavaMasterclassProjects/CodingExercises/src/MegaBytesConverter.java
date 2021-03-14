public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mbPart = kiloBytes / 1024;
            int kbPart = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " +
                    mbPart + " MB and " +
                    kbPart + " KB"
            );
        }
    }

    public static void testPrintMegaBytesAndKiloBytes() {
        int randomKB = (int) Math.floor(1000000 * Math.random());

        printMegaBytesAndKiloBytes(randomKB);
        printMegaBytesAndKiloBytes(-randomKB);
        printMegaBytesAndKiloBytes(0);
    }
}