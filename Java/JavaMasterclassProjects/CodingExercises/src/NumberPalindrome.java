public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int reverse = num % 10;

        for (int quotient = num / 10; quotient != 0; quotient /= 10) {
            reverse *= 10;
            reverse += quotient % 10;
        }

        return (reverse == num);
    }

    public static void testIsPalindrome() {
        System.out.println("isPalindrome(-1221) is "
                + isPalindrome(-1221));
        System.out.println("isPalindrome(707) is "
                + isPalindrome(707));
        System.out.println("isPalindrome(11212) is "
                + isPalindrome(11212));

        // generate a random integer..
        // between the MIN and MAX values
        // that can be stored in an 'int'
        // primitive data type and
        // check if it is a palindrome
        int random = 0;
        // generate a palindrome integer
        do {
            random = 1 +  (int) (Math.random() * (Integer.MAX_VALUE - 1));
        } while (!isPalindrome(random));

        System.out.println("Randomly generated number that is a palindrome = "
                + random);
    }
}
