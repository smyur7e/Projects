package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("sumDigits(1) = " + sumDigits(1));
        System.out.println("sumDigits(9) = " + sumDigits(9));
        System.out.println("sumDigits(125) = " + sumDigits(125));
        System.out.println("sumDigits(-125) = " + sumDigits(-125));
        int randomInt = (int) (1 + Math.random() * (Integer.MAX_VALUE - 1));
        System.out.println("sumDigits("+ randomInt + ") = " + sumDigits(randomInt));
    }

    public static int sumDigits(int num) {
        int sum = -1;

        if (num >= 10) {
            sum = 0;
            do {
                sum += num % 10;
                num /= 10;
            } while (num > 0);
        }

        return sum;
    }
}
