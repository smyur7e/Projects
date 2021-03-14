package academy.learnprogramming;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

public class Main {

  public static void main(String[] args) {
    int i = (1 - 2);
    String s1 = "I am a string";
    int[] ia = {1, 2, 3, 4};
    Object o = ia;
    double d1 = .015d;
    double d2 = 1.5e-2d;
    String s2 = "I am a string";

    System.out.println("d1 == d2 is "
        + (d1 == d2));
    System.out.println("s1 == s2 is "
        + (s1 == s2));

    System.out.println("+i = " + +i);

    System.out.println(
        "String " + "\"" + s1 + "\""
            + (s1 instanceof Object ? " is" : " is not")
            + " an instance of Object.");

    System.out.println(
        "Array " + "\"{"
            + ia[0] + ", "
            + ia[1] + ", "
            + ia[2] + ", "
            + ia[3] + "}\""
            + (ia instanceof Object ? " is" : " is not")
            + " is an instance of Object.");

    System.out.println(
        "Object \"o\""
            + (o instanceof String ? " is" : " is not")
            + " an instance of String.");

    // We can instanceof to check if an object is an array
    System.out.println(
        "Object \"o\""
            + (o instanceof int[] ? " is" : " is not")
            + " an instance of int[]");
  }
}
