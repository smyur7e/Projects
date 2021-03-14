import java.util.Scanner;

public class InputCalculator {
  public static void inputThenPrintSumAndAverage() {
    int sum = 0;
    int count = 0;
    long average = 0;
    Scanner inputLine = new Scanner(System.in);

    System.out.println(
      "Enter a number or many numbers separated by a ' ' .Any other"
      + " character(s) entered will print the sum and average of the"
      + " numbers entered");

    while (inputLine.hasNextInt()) { // if the value entered is an int
      sum += inputLine.nextInt();
      count++;
    }

    inputLine.close();

    if (count == 0) {
      average = 0;
    } else {
      average = Math.round((double) sum / count);
    }

    System.out.println("SUM = " + sum + " AVG = " + average);
  }
}