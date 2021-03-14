package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initialise min and max values
        // to the opposite extremities,
        // so that the first (valid) value
        // entered by the user is always
        // accepted as both the min and
        // the max.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner sysin = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a valid number:");

            if (sysin.hasNextInt()) {
                int num = sysin.nextInt();

                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                    }
            } else {
                System.out.println("Invalid number entered. So, stopping here!");
                if (max >= min) {
                    System.out.println("Min = " + min + ", Max = " + max);
                }
                break;
            }

            sysin.nextLine();
        }

        sysin.close();
    }
}
