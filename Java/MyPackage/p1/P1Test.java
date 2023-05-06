package p1;

class P1Test {
  public static void main(String[] args) {
    Base b = new Base();
    SamePkgSub sps = new SamePkgSub();

    System.out.println("Base::b = " + b.toString());
    System.out.println("SamePkgSub::sps = " + sps.toString());
  }
}