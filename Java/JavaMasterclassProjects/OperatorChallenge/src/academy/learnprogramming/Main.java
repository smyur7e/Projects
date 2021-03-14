package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double first = 20.00;
        double second = 80.00;
        double sum100 = (first + second) * 100.00;
        double remainder = sum100 % 40.00;

        boolean isRemainderZero = remainder == 0 ? true : false;
        System.out.println("isRemainderZero is " + isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("The remainder is " + remainder);
        }
    }
}
