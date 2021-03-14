package academy.learnprogramming;

public class VarArgsVsArrayTest {
  String[] args;

//  VarArgsVsArrayTest(String[] args) {
//    this.args = args;
//  }

  VarArgsVsArrayTest(String...args) {
    this.args = args;
  }

  public String toString() {
    String result = null;

    for (int i = 0; i < args.length; i++) {
      if (i == 0)
        result = this.args[i];
      else
        result += ", " + this.args[i];
    }

    return result;
  }
}
