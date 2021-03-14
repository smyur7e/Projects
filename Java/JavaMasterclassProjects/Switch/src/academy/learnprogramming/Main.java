package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
            case 1 :
                System.out.println("Value was 1");
                break;
            case 2 :
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, 4 or 5");
                System.out.println("Actually the value was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                // break;
        }

        // Challenge
        char someChar = 'F';

        switch (someChar) {
            case 'A':
                System.out.println("Value was 'A'");
                break;
            case 'B':
                System.out.println("Value was 'B'");
                break;
            case 'C':
                System.out.println("Value was 'C'");
                break;
            case 'D':
                System.out.println("Value was 'D'");
                break;
            case 'E':
                System.out.println("Value was 'E'");
                break;
            default:
                System.out.println("Value is not 'A', 'B', 'C', 'D' or 'E'");
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january" :
                System.out.println("Jan");
                break;
            case "december":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
