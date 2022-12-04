package p1;

class P1Test {
  public static void main(String[] args) {
    Base b = new Base();
    SamePkgSub sps = new SamePkgSub();

    System.out.println(b.ToString());
    System.out.println(sps.ToString());
  }
}