public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeup = barking;

        if (barking) {
            wakeup = (hourOfDay == 23 ||
                    hourOfDay >= 0 && hourOfDay < 8) ?
                    true
                    : false;
        }

        return wakeup;
    }

    public static void testShouldWakeUp() {
        if (shouldWakeUp(true, 2))
            System.out.println("test 1 passed");
        else
            System.out.println("test 1 failed");

        if (!shouldWakeUp(true, 8))
            System.out.println("test 2 passed");
        else
            System.out.println("test 2 failed");

        if (!shouldWakeUp(true, 24))
            System.out.println("test 3 passed");
        else
            System.out.println("test 3 failed");

        if (!shouldWakeUp(true, -1))
            System.out.println("test 4 passed");
        else
            System.out.println("test 4 failed");

        if (shouldWakeUp(true, 0))
            System.out.println("test 5 passed");
        else
            System.out.println("test 5 failed");

        if (!shouldWakeUp(true, 9))
            System.out.println("test 6 passed");
        else
            System.out.println("test 6 failed");

        if (!shouldWakeUp(true, 22))
            System.out.println("test 7 passed");
        else
            System.out.println("test 7 failed");

        if (shouldWakeUp(true, 23))
            System.out.println("test 8 passed");
        else
            System.out.println("test 8 failed");

        if (!shouldWakeUp(false, 2))
            System.out.println("test 9 passed");
        else
            System.out.println("test 9 failed");

        if (!shouldWakeUp(false, 8))
            System.out.println("test 10 passed");
        else
            System.out.println("test 10 failed");

        if (!shouldWakeUp(false, 24))
            System.out.println("test 11 passed");
        else
            System.out.println("test 11 failed");

        if (!shouldWakeUp(false, 0))
            System.out.println("test 12 passed");
        else
            System.out.println("test 12 failed");

        if (!shouldWakeUp(false, 9))
            System.out.println("test 13 passed");
        else
            System.out.println("test 13 failed");

        if (!shouldWakeUp(false, 22))
            System.out.println("test 14 passed");
        else
            System.out.println("test 14 failed");

        if (!shouldWakeUp(false, 23))
            System.out.println("test 15 passed");
        else
            System.out.println("test 15 failed");
    }
}