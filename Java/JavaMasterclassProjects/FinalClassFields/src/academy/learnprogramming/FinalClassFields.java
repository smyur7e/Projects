package academy.learnprogramming;

public class FinalClassFields {
  final public static int UNINITIALISED;
  final public  static int ZERO = 0;

  public static void setConstUninitialised(int i) {
    FinalClassFields.UNINITIALISED = i;
  }

  public static void setConstZero(int i) {
    FinalClassFields.ZERO = i;
  }
}
