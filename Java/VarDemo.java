class VarDemo {
  public static void main(String[] args) {
    // var varArray = {1, 2, 3}; // this is not allowed.
    // var[] varArray = new int[3]; // this is not allowed.
    // var varArray[] = new int[3]; // this is not allowed.
    var varArray = new int[3];

    for (var i = 0; i < 3; i++) {
      varArray[i] = i + 1;
      System.out.println
        ("varArray [" + i + "] = " + varArray[i]);
    }
  }
}