public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        int sum = -1;

        if (num >= 0) {
            // initialise sum to the remainder of the number
            // when divided by 10 and keep discarding all other
            // digits of the number until only the most
            // significant digit is left.
            for (sum = num % 10; num / 10 > 0; num /= 10);
            sum += num;
        }

        return sum;
    }

    public static void testSumFirstAndLastDigit() {
        System.out.println("sumFirstAndLastDigit(252) = " +
                sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257) = " +
                sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0) = " +
                sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5) = " +
                sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10) = " +
                sumFirstAndLastDigit(-10));
    }
}
