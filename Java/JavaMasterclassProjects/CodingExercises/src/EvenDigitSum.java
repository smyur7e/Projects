public class EvenDigitSum {
    public static int getEvenDigitSum(int num) {
        int sum = -1;

        if (num >= 0) {
            sum = 0;

            for (int lastDigit = 0; num > 0; num /= 10) {
                lastDigit = num % 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
            }
        }

        return sum;
    }

    public static void testGetEvenDigitSum() {
        System.out.println("EvenDigitSum.getEvenDigitSum(123456789) = " +
            getEvenDigitSum(123456789));
        System.out.println("EvenDigitSum.getEvenDigitSum(252) = " +
            getEvenDigitSum(252));
        System.out.println("EvenDigitSum.getEvenDigitSum(-22) = " +
            getEvenDigitSum(-22));
        System.out.println("EvenDigitSum.getEvenDigitSum(0) = " +
            getEvenDigitSum(0));
    }
}