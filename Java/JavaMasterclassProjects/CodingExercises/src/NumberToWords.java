public class NumberToWords {

    public static int getDigitCount(int num) {
        int numDigits = -1;

        if (num >= 0) {
            numDigits = 1;
            for (int dividend = num; dividend / 10 != 0; dividend /= 10)
                numDigits++;
        }

        return numDigits;
    }

    public static int reverse(int num) {
        int flip = num % 10;

        for (int dividend = num / 10; dividend != 0; dividend /= 10) {
            flip = (flip * 10) + dividend % 10;
        }

        return flip;
    }

    public static void numberToWords(int num) {
        String numInWords = "";

        if (num < 0) {
            numInWords = "Invalid Value";
        } else if (num == 0) {
            numInWords = "Zero";
        } else {
            int remainder;
            int dividend = reverse(num);
            int divLength = getDigitCount(dividend);
            int numLength = getDigitCount(num);

            while (dividend > 0) {
                remainder = dividend % 10;

                if (numInWords != "")
                    numInWords += " ";

                switch(remainder) {
                    case 0: numInWords += "Zero";
                        break;
                    case 1: numInWords += "One";
                        break;
                    case 2: numInWords += "Two";
                        break;
                    case 3: numInWords += "Three";
                        break;
                    case 4: numInWords += "Four";
                        break;
                    case 5: numInWords += "Five";
                        break;
                    case 6: numInWords += "Six";
                        break;
                    case 7: numInWords += "Seven";
                        break;
                    case 8: numInWords += "Eight";
                        break;
                    default: numInWords += "Nine";
                        break;
                }

                dividend /= 10;
            }

            for (int i = divLength; i < numLength; i++)
                numInWords += " Zero";
        }

        System.out.println(numInWords);
    }

    public static void testNumberToWords() {
        System.out.println("getDigitsCount(0) = " + getDigitCount(0));
        System.out.println("getDigitsCount(123) = " + getDigitCount(123));
        System.out.println("getDigitsCount(-12) = " + getDigitCount(-12));
        System.out.println("getDigitsCount(-5200) = " + getDigitCount(-5200));
        System.out.println("getDigitsCount(10000) = " + getDigitCount(10000));

        System.out.println("reverse(121) = " + reverse(121));
        System.out.println("reverse(1212) = " + reverse(1212));
        System.out.println("reverse(100) = " + reverse(100));
        System.out.println("reverse(-1234) = " + reverse(-1234));
        System.out.println("reverse(7) = " + reverse(7));

        System.out.println("numberToWords(123) = "); numberToWords(123);
        System.out.println("numberToWords(1000) = "); numberToWords(1000);
        System.out.println("numberToWords(1010) = "); numberToWords(1010);
        System.out.println("numberToWords(-12) = "); numberToWords(-12);
    }
}
