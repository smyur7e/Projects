package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        long sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(counter < 10) {
            System.out.println("Enter number #" + (counter + 1) + ":");
            if (scanner.hasNextInt()) { // input examined but not parsed - scanner is not advanced
                sum += scanner.nextInt(); // input parsed up to BUT not including delimiter
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // scanner advanced past current line
        }

        scanner.close();
        System.out.println("The sum of the numbers = " + sum);
    }
}
