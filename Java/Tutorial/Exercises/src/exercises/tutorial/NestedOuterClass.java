package exercises.tutorial;

public class NestedOuterClass {

  private static String staticOuterString = "OuterStatic1";
  private String outerName;

  public NestedOuterClass(String name) {
    this.outerName = name;
    System.out.println("Constructed " + this.outerName);
  }

  public static class StaticInnerClass {

    private String staticInnerName;

    public StaticInnerClass(String name) {
      this.staticInnerName = name;
      System.out.println("Constructed " + this.staticInnerName);
      System.out.println("I can also access static outer member " +
          NestedOuterClass.staticOuterString);
      // cannot access private members of the outclass through instance of the inner class
      // System.out.println(this.outerName);
    }
  }

  public class InnerClass {

    private String innerName;

    public InnerClass(String name) {
      this.innerName = name;
      System.out.println("Constructed " + this.innerName);
      System.out.println("I can access the outer instance "
          + NestedOuterClass.this.outerName);
    }
  }
}
