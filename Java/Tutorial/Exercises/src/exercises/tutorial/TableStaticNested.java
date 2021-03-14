package exercises.tutorial;

// Example of a static nested class
public class TableStaticNested {

  static class Column {
    private String name;
    private String type;

    // constructor for static inner class
    public Column(String name, String type) {
      this.name = name;
      this.type = type;
    }

    public String getName() {
      return this.name;
    }

    public String getType() {
      return this.type;
    }
  }

  private Column[] cols;
  private String name;

  public TableStaticNested(String name, Column... cols) {
    this.name = name;
    this.cols = cols;
  }

  public String getName() {
    return this.name;
  }

  public Column[] getCols() {
    return this.cols;
  }

  public Column[] getCols(String... colNames) {
    Column[] toReturn = new Column[colNames.length];
    boolean colsFound = false;

    for (int i = 0; i < colNames.length; i++) {
      for (int j = 0; j < this.cols.length; j++) {
        if (colNames[i].equals(this.cols[j].getName())) {
          toReturn[i] = this.cols[j];
          colsFound = true;
          break;
        }
      }
    }

    if (colsFound)
      return toReturn;
    else
      return null;
  }
}
