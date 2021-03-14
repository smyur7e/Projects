public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        boolean foundShared = false;

        if (first >= 10 && first <= 99 &&
            second >= 10 && second <= 99) {

            int firstDigit, secondDigit = -1;

            loop1:
            for (int firstQ = first; firstQ > 0; firstQ /= 10) {
                firstDigit = firstQ % 10;
                for (int secondQ = second; secondQ > 0; secondQ /= 10) {
                    secondDigit = secondQ % 10;
                    if (firstDigit == secondDigit) {
                        foundShared = true;
                        break loop1; // Using labelled break;
                    }
                }
            }
        }

        return foundShared;
    }

    public static void testHasSharedDigit() {
        System.out.println("hasSharedDigit(12,23) is " + hasSharedDigit(12,23));
        System.out.println("hasSharedDigit(9,99) is " + hasSharedDigit(9,99));
        System.out.println("hasSharedDigit(15,55) is " + hasSharedDigit(15,55));
        System.out.println("hasSharedDigit(12,55) is " + hasSharedDigit(12,55));
    }
}
