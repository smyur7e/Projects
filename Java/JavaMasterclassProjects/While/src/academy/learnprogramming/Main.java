package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        System.out.println("While loop checking for count");
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("While loop using an ALWAYS valid condition" +
//                " and using 'break;' to get out of the loop");
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        System.out.println("For loop");
//        for (count = 1; count != 6; count++) {
//            System.out.println("count value is " + count);
//        }
//
//        System.out.println("'do..while' donig the same thing" +
//                "..it executes AT LEAST once");
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);
//
//        System.out.println("Check if it is an even number");
//        System.out.println("isEvenNumber(2) = " + isEvenNumber(2));
//        System.out.println("isEvenNumber(3) = " + isEvenNumber(3));
//
//        //loop to find a random even number
//        int number = 2;
//        int finishNumber = 20;
//        //Challenge - stop once 5 numbers are found
//        count = 0;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            count++;
//            System.out.println("Even number " + number);
//
//            if (count == 5) {
//                System.out.println("Found " + count + " numbers");
//                break;
//            }
//        }

        //'break' and 'continue' statements MUST appear inside a 'switch'
        // , 'while', 'do..while' or 'for' statement/statement block;

        if (true) {
//            break; // Will not compile
//            continue;
            System.out.println("I appear after a 'break' statement inside a loop");
        }
    }

    private static boolean isEvenNumber(int num) {
        return (num % 2 == 0)? true: false;
    }
}
