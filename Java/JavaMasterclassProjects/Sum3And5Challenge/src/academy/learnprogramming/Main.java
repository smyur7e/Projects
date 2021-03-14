package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count3And5 = 0;
        int sum3And5 = 0;
        int maxCount3And5 = 5;

        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                sum3And5 += i;
                count3And5++;
                System.out.println("Number Found is " + i);

                if (count3And5 == maxCount3And5) {
                    break;
                }
            }
        }

        System.out.println("Sum of first " +
                maxCount3And5 +
                " numbers between 1 and 1000 that are divisible by both 3 and 5 is " +
                sum3And5
        );
    }
}
