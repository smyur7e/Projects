public class TeenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3) {
        if (isTeen(age1)
            || isTeen(age2)
            || isTeen(age3))
            return true;
        else
            return false;
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }

    public static void testHasTeen() {
        printTeenNumberChecker(9, 99, 19);
        printTeenNumberChecker(23, 15, 42);
        printTeenNumberChecker(23, 23, 34);
    }

    private static void printTeenNumberChecker(int a, int b, int c) {
        System.out.println("Ages " +
                a + ", " +
                b + ", " +
                c + " " +
                ( hasTeen(a, b, c)? "has" : "does not have") +
                " a teen"
        );
    }
}
