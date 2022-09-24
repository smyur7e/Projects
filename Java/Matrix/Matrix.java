class Matrix {
  private int rowCount;
  private int colCount;
  private double element[][];

  // Constructor - use default values if supplied values are not correct.
  Matrix(int rc, int cc) {
    if (rc < 1)
      rowCount = 1;
    else
      rowCount = rc;

    if (cc < 1)
      colCount = 1;
    else
      colCount = cc;

    element = new double[rowCount][colCount];

    for (int r = 0; r < rowCount; ++r)
      for (int c = 0; c < colCount; ++c)
        element[r][c] = Double.NaN; // Initalise to NaN - Not-a-Number
  }

  // Getters
  int getRowCount() {
    return rowCount;
  }

  int getColCount() {
    return colCount;
  }

  // Gets value in a cell of the matrix
  // (OR) NaN if out of bounds.
  double get(int row, int col) {
    if (row > -1 && row < rowCount &&
        col > -1 && col < colCount)
      return element[col][row];
    else {
      if (row < 0 || row >= rowCount)
        System.out.println("Row " + row + " does not exist.");
      if (col < 0 || col >= colCount)
        System.out.println("Column " + col + " does not exist.");
      return Double.NaN;
    }
  }

  // Sets value is a cell of the matrix
  // (OR) NaN if out of bounds
  double set(int row, int col, double value) {
    if (row > -1 && row < rowCount &&
        col > -1 && col < colCount)
       return element[row][col] = value;
    else
       return Double.NaN;
  }

  // Return another matrix that is the transpose of this matrix
  Matrix transpose() {
    var t = new Matrix(this.colCount, this.rowCount);

    for (int tr = 0; tr < t.rowCount; ++tr)
      for (int tc = 0; tc < t.colCount; ++tc)
        t.element[tr][tc] = this.element[tc][tr];

    return t;
  }

  // Print to console the contents of a given row
  void printRow(int r) {
    if (r < rowCount && r > -1) {
      System.out.print("Row " + r + ": [");

      for (int c = 0; c < colCount; ++c) {
        if (c > 0) System.out.print(" ");
        System.out.print(element[r][c]);
      }

      System.out.println("]");
    } else {
      System.out.print("Row " + r + " does not exist");
    }
  }
}