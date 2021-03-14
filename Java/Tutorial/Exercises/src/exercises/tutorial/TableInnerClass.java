package exercises.tutorial;
import java.util.*;

public class TableInnerClass {

  class Column { // can still keep this private
    private String name;
    private String type;

    // constructor for inner class
    private Column(String name, String type) {
      this.name = name;
      this.type = type;
    }

    public String getName() {
      // return this.name;
      return TableInnerClass.this.name + "." + this.name;
    }

    public String getType() {
      return this.type;
    }

  }

  private ArrayList <Column> cols;
  private String name;

  public TableInnerClass(
      String tableName,
      String firstColName,
      String firstColType) {
    this.name = tableName;
    this.cols = new ArrayList<Column>();

    cols.add(new Column(firstColName, firstColType));
  }

  public void addColumn(String colName, String colType) {
    for (Column c : this.cols) {
      if (c.getName() == colName)
        return; // do not add any new column with the same name.
    }
    cols.add(new Column(colName, colType));
  }

  public String getName() {
    return this.name;
  }

  public Column[] getCols() {
    return this.cols.toArray(
        new Column[0]); // empty array of type Column is a valid argument
  }

  public Column[] getCols(String... colNames) {
    ArrayList <Column> toReturn = new ArrayList <Column> ();
    boolean colsFound = false;

    for (Column c: this.cols) {
      for (int i = 0; i < colNames.length; i++) {
        if ((this.name + "." + colNames[i]).equals(c.getName())) {
          toReturn.add(c);
          colsFound = true;
          break;
        }
      }
    }

    if (colsFound)
      return toReturn.toArray(
          new Column[0]); // empty array of type Column is a valid argument
    else
      return null;
  }
}
