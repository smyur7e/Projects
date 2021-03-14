package academy.learnprogramming;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        /*
                Every primitive numeric type has a Wrapper class:
                For example,
                 for int it's Integer,
                 for byte it's Byte,
                 for short it's Short,
                 for long it's Long,
                All numeric wrapper classes have 2 fields
                MIN_VALUE and MAX_VALUE that store
                smallest and largest values that may be assigned
                to the corresponding primitive type.
        */
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Overflow - NO ERROR
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // Underflow - NO ERROR

        // int myOverflowedIntValue = 2147483648; // COMPILE ERROR - literal value too large for variable

         /*
         Any literal number without any character at
         the end is of data type 'int'. It can be
         'punctuated' using underscores (uncommon
         valid from Java 7).

         However, if the actual value of the literal
         can is within the limits of the target
         data type, the compiler will accept it even
         if that data type is NOT of type "int".


         */
        int myMaxIntUnderscoredValue = 2_147_483_647; // Underscores to punctuate is OK - wow!
        System.out.println("The value of the 'myMaxIntUnderscoredValue' = " + myMaxIntUnderscoredValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        //Without the trailing 'L' this value is too large for an int
        long bitLongLiteralValue = 2_147_483_647_123L;
        System.out.println(bitLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        /*
        The following statements will not compile
        without a an explicit "cast" because the
        default size assigned to the result of an
        arithmetic expression in Java is an int.
        */
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinByteValue / 2);

        /*
        If the target type is SMALLER than ANY of the
        source types, an EXPLICIT cast is required.
        */
        int myIntLongValue = (int) (bitLongLiteralValue / 2);
    }
}
