public class SumOddRange {

    public static boolean isOdd (int num) {
        return (num > 0 & num % 2 == 1)? true : false;
    }

    public static int sumOdd(int start, int end) {
        int sum = -1;

        if (start > 0 && end > 0 && start <= end) {
            sum = 0;

            // don't add both the start and end if
            // they are equal so run the loop
            // if start < end;
            for (int i = start; i < end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }

            // Add end if it is even
            if (isOdd(end)) {
                sum += end;
            }
        }

        return sum;
    }

    public static void testSumOdd() {
        System.out.println("sumOdd(1, 100) = " + sumOdd(1, 100));
        System.out.println("sumOdd(-1, 100) = " + sumOdd(-1, 100));
        System.out.println("sumOdd(100, 100) = " + sumOdd(100, 100));
        System.out.println("sumOdd(13, 13) = " + sumOdd(13, 13));
        System.out.println("sumOdd(100, 100) = " + sumOdd(100, 100));
        System.out.println("sumOdd(-100, -100) = " + sumOdd(-100, -100));
        System.out.println("sumOdd(100, 1000) = " + sumOdd(100, 1000));
    }
}
