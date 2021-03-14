public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean packable = false;

//        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
//            int remainder = goal;
//            int bigFitCount
//
//            if (bigSize > 0 )
//                remainder %= bigSize;
//
//            if (remainder <= smallCount)
//                packable = true;
//        }

        return packable;
    }

    public static void testCanPack() {
        System.out.println("canPack(1, 0, 4) = " + canPack(1, 0, 4));
        System.out.println("canPack(1, 0, 6) = " + canPack(1, 0, 6));
        System.out.println("canPack(1, 0, 5) = " + canPack(1, 0, 5));
        System.out.println("canPack(2, 1, 5) = " + canPack(1, 0, 5));
        System.out.println("canPack(0, 5, 4) = " + canPack(0, 5, 4));
        System.out.println("canPack(2, 2, 11) = " + canPack(2, 2, 11));
        System.out.println("canPack(-3, 2, 12) = " + canPack(-3, 2, 12));
    }
}
