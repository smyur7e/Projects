package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        System.out.println("Ascending loop");
        for (double interest = 2.0; interest < 9.0; interest++) {
            System.out.println("10,000 at " + interest + "% interest = " +
                String.format("%.2f", calculateInterest(10000.0, interest)));
        }

        System.out.println("Descending loop");
        for (double interest = 8.0; interest > 1.0; interest--) {
            System.out.println("10,000 at " + interest + "% interest = " +
                String.format("%.2f", calculateInterest(10000.0, interest)));
        }

        // prime number challenge
        int primeCount = 0;
        int limit = (int) (Math.random() * 1000000 + 1);
        System.out.println("Limit for prime number generation is " + limit);
        boolean loopInitPrinted = false;
        for (int i = (int) (1 + Math.random() * limit); i <= limit; i++) {
            if (!loopInitPrinted) {
                System.out.println("Loop started at " + i);
                loopInitPrinted = true;
            }
            if (isPrime(i)) {
                System.out.println("Found prime number = " + i);
                primeCount++;
            }

            if (primeCount == 3) {
                System.out.println("Found 3 primes so exiting loop");
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }

    public static boolean isPrime(int n) {
        int sqrt = (int) (Math.sqrt(n));

        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
