package p2;
import p1.*;

class P2Test {
  public static void main(String[] args) {
    p1SubDiffPkg p1sdp = new p1SubDiffPkg();
    Base b = new Base();

    // Error: Cannot access protect member.
    // System.out.println("Base::b.pro = " + b.pro);

    System.out.println("Base::b = " + b.toString());
    System.out.println("p1SubDiffPkg::p1sdp = " + p1sdp.toString());
  }
}