public class EqualSumChecker {
    public static boolean hasEqualSum (int n1, int n2, int n3) {
        return (n3 == n1 + n2);
    }

    public static void testHasEqualSum() {
        printEqualSumChecker(1, 1, 1);
        printEqualSumChecker(1, 1, 2);
        printEqualSumChecker(1, -1, 0);
    }

    private static void printEqualSumChecker(int a, int b, int c) {
        System.out.println(a + " + " + b + (hasEqualSum(a, b, c)? " = ": " != ") + c);
    }
}