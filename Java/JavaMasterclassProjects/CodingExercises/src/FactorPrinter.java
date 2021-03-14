public class FactorPrinter {

    public static void printFactors(int num) {
        String factors;

        if (num < 1) {
            factors = "Invalid Value";
        } else if (num == 1) {
            factors = "" + num;
        } else {
            factors = "1";
            boolean sigFactorFound = false;
            int sqrtNum = (int) Math.sqrt(num);

            for (int i = 2; i < num; i++) {
                if (i > sqrtNum && !sigFactorFound) {
                    // Num is prime because
                    // no significant divisor <= sqrt(num)
                    // was found
                    break;
                } else if (num % i == 0) {
                    factors += " " + i;
                    sigFactorFound = true;
                }
            }

            factors += " " + num;
        }

        System.out.println(factors);
    }

    public static void testPrintFactors(){
        System.out.println("printFactors(6) = "); printFactors(6);
        System.out.println("printFactors(32) = "); printFactors(32);
        System.out.println("printFactors(10) = "); printFactors(10);
        System.out.println("printFactors(1) = "); printFactors(1);
        System.out.println("printFactors(-1) = "); printFactors(-1);
        System.out.println("printFactors(31) = "); printFactors(31);
        System.out.println("printFactors(" + (Integer.MAX_VALUE - 3) + ") = "); printFactors(Integer.MAX_VALUE - 3);
    }
}
