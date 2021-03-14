package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        int minutes = 122;
        int seconds = 2;

        System.out.println(minutes + "m " + seconds + "s = " +
            getDurationString(minutes, seconds));

        int largeSeconds = Integer.MAX_VALUE;
        System.out.println(largeSeconds + "s = " +
                getDurationString(largeSeconds));

    }

    private static String getDurationString(int minutes, int seconds) {
        String hms;

        if (minutes >= 0 && seconds >= 0 && seconds < 60) {
            hms = prefixLeading0(minutes / 60) + "h ";
            hms += prefixLeading0(minutes % 60) + "m ";
            hms += prefixLeading0(seconds) + "s";
        } else {
            hms = INVALID_VALUE_MESSAGE;
        }

        return hms;
    }

    private static String prefixLeading0 (int value) {
        return ((value < 10)? "0" : "") + value;
    }

    private static String getDurationString(int seconds) {
        return (seconds >= 0)?
                getDurationString(seconds / 60, seconds % 60) :
                INVALID_VALUE_MESSAGE;
    }
}
