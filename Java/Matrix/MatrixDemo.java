class MatrixDemo {
  public static void main(String args[]) {
    Matrix m = new Matrix (2, 3);

    System.out.println("Matrix defined as:");
    for (int i = 0; i < m.getRowCount(); ++i) {
      for (int j = 0; j < m.getColCount(); ++j)
        m.set(i, j, i+j);
      m.printRow(i);
    }

    System.out.println("Transpose of the matrix is:");
    Matrix tm = m.transpose();
    for (int i = 0; i < tm.getRowCount(); ++i)
      tm.printRow(i);

    // Checking error messages
    m.set(2,3,Math.PI);
    m.get(2,3);
    m.printRow(2);
  }
}