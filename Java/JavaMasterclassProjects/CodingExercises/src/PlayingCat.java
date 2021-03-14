public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45 ||
                !summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }
    }

    public static void testIsCatPlaying() {
        System.out.println("isCatPlaying(true, 10) = " + isCatPlaying(true, 10));
        System.out.println("isCatPlaying(false, 36) = " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35) = " + isCatPlaying(false, 35));
    }
}
