public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        boolean found = false;

        if (isValid(a) && isValid(b) && isValid(c)) {
            int lastA = a % 10;
            int lastB = b % 10;
            int lastC = c % 10;

            if (lastA == lastB || lastB == lastC || lastA == lastC)
                found = true;
        }

        return found;
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000)? true : false;
    }

    public static void testHasSameLastDigit() {
        System.out.println("hasSameLastDigit(41, 22, 71) is " + hasSameLastDigit(41, 22, 71));
        System.out.println("hasSameLastDigit(23, 32, 42) is " + hasSameLastDigit(23, 32, 42));
        System.out.println("hasSameLastDigit(9, 99, 999) is " + hasSameLastDigit(9, 99, 999));
        System.out.println("hasSameLastDigit(10, 99, 999) is " + hasSameLastDigit(10, 99, 999));
    }
}