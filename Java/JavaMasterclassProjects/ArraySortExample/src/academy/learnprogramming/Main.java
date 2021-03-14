package academy.learnprogramming;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        double[] toSort = {
            -1232.4, 2323.232, -39472389.35, -86, 6.023e23
        };
        double[] dupToSort = Arrays.copyOf(toSort, toSort.length);
        String comparisonResult =
            "is"
            + (Arrays.equals(toSort, dupToSort) ? "" : "not")
            + " equal to";

        System.out.println("Array \"toSort\" "
            + comparisonResult
            + " array \"dupToSort\"");

        System.out.println("\"toSort\" before sorting");
        System.out.println("toSort[" + 0 +"] = " + toSort[0]);
        System.out.println("toSort[" + 1 +"] = " + toSort[1]);
        System.out.println("toSort[" + 2 +"] = " + toSort[2]);
        System.out.println("toSort[" + 3 +"] = " + toSort[3]);
        System.out.println("toSort[" + 4 +"] = " + toSort[4]);

        System.out.println("\n----------");
        Arrays.sort(toSort);
        System.out.println("\"toSort\" after sorting");
        System.out.println("toSort[" + 0 +"] = " + toSort[0]);
        System.out.println("toSort[" + 1 +"] = " + toSort[1]);
        System.out.println("toSort[" + 2 +"] = " + toSort[2]);
        System.out.println("toSort[" + 3 +"] = " + toSort[3]);
        System.out.println("toSort[" + 4 +"] = " + toSort[4]);

        System.out.println("-86 occurs at index " + Arrays.binarySearch(toSort, -86d));
        System.out.println("-49 occurs at index " + Arrays.binarySearch(toSort, -49d));
    }

    private static String comparisonResult(double[] )
}
