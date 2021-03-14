package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        char[] copyFrom =
                { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo;

         copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
//        copyTo = new char[7];
//        System.arraycopy(copyFrom,2, copyTo, 0,7);

        System.out.println(copyTo);
    }
}
