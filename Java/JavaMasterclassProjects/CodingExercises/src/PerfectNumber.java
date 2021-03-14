public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        boolean numPerfect = false;

        if (num > 1) {
            int sum = 1;
            boolean properDivisorFound = false;
            int sqrtNum = (int) Math.sqrt(num);

            for (int i = 2; i < num; i++) {
                if (i > sqrtNum && !properDivisorFound) {
                    // Number is prime
                    break;
                } else if (num % i == 0) {
                    properDivisorFound = true;
                    sum += i;
                }
            }

            numPerfect = (sum == num);
        }

        return numPerfect;
    }

    public static void testIsPerfectNumber() {
        System.out.println("isPerfectNumber(6) = " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) = " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5) = " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) = " + isPerfectNumber(-1));
        System.out.println("isPerfectNumber(1) = " + isPerfectNumber(1));
        System.out.println("isPerfectNumber(11) = " + isPerfectNumber(11));
    }
}
