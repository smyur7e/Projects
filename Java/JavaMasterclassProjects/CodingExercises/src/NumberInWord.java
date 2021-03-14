public class NumberInWord {
    public static void printNumberInWord(int number) {
        String numberInWord;

        switch (number) {
            case 0: numberInWord = "ZERO"; break;
            case 1: numberInWord = "ONE"; break;
            case 2: numberInWord = "TWO"; break;
            case 3: numberInWord = "THREE"; break;
            case 4: numberInWord = "FOUR"; break;
            case 5: numberInWord = "FIVE"; break;
            case 6: numberInWord = "SIX"; break;
            case 7: numberInWord = "SEVEN"; break;
            case 8: numberInWord = "EIGHT"; break;
            case 9: numberInWord = "NINE"; break;
            default: numberInWord = "OTHER";
        }

        System.out.println(numberInWord);
    }

    public static void testPrintNumberInWord() {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
    }
}
