public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int a, int b) {
        int gcd = -1;

        if (a >= 10 && b >= 10) {

            if (a == b) {
                gcd = a;
            } else {
                int dividend, divisor;

                if (a > b) {
                    dividend = a;
                    divisor = b;
                } else {
                    dividend = b;
                    divisor = a;
                }

                int remainder;
                do {
                    remainder = dividend % divisor;
                    dividend = divisor;
                    divisor = remainder;
                } while (remainder > 0);

                gcd = dividend;
            }
        }

        return gcd;
    }

    public static void testGetGreatestCommonDivisor() {
        System.out.println("getGreatestCommonDivisor(25, 15) = " + getGreatestCommonDivisor(25, 15));
        System.out.println("getGreatestCommonDivisor(12, 30) = " + getGreatestCommonDivisor(12, 30));
        System.out.println("getGreatestCommonDivisor(9, 18) = " + getGreatestCommonDivisor(9, 18));
        System.out.println("getGreatestCommonDivisor(81, 153) = " + getGreatestCommonDivisor(81, 153));
    }
}
