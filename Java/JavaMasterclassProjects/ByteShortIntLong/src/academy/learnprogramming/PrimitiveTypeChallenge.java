package academy.learnprogramming;

public class PrimitiveTypeChallenge {

    public static void main(String[] args) {

        byte myByte = 122;
        System.out.println("myByte = " + myByte);

        short myShort = 31000;
        System.out.println("myShort = " + myShort);

//        int myInt = 2_100_000_000;
        int myInt = 2_100_000;
        System.out.println("myInt = " + myInt);

        long myCalcLong = 50000 + 10 * (myByte + myShort + myInt);
        System.out.println("myCalcLong = " + myCalcLong);
    }
}
