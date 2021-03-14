package exercises.tutorial;

public class Main {

  // Test Deck.java
//  public static void main(String[] args) {
//  // write your code here
//      Card[] deckCards = new Deck().getShuffledDeck();
//
//      for (int i = 0; i < deckCards.length; i++) {
//          System.out.println("Card #" + (i+1) + ": "
//              + deckCards[i].getRank() + " of " + deckCards[i].getSuit());
//      }
//  }

  // Testing Inner Classes
//  public static void main(String[] args) {
//    NestedOuterClass.StaticInnerClass sic = new NestedOuterClass.StaticInnerClass("StaticInner1");
//    NestedOuterClass oc = new NestedOuterClass("OuterClass1");
//    NestedOuterClass.InnerClass ic = oc.new InnerClass("InnerClass1");
//  }

  // Testing local class
  //  public static void main(String[] args) {
  //    LocalClassExample.validatePhoneNumber("0413-940-499", "0413-xxx-yyy");
  //  }

  public static void main(String[] args) {

    // Testing static nested class
/*
    TableStaticNested someTable = new TableStaticNested("Customer",
        new TableStaticNested.Column("ID", "Integer"),
        new TableStaticNested.Column("Name", "String"),
        new TableStaticNested.Column("DOB", "Calendar"),
        new TableStaticNested.Column("Sex", "String")
        );
    TableStaticNested.Column[] selCols = someTable.getCols("ID", "DOB");
    // TableInnerClass.Column[] selCols = someTable.getCols();
*/


    // Testing with inner class
/*
    TableInnerClass someTable = new TableInnerClass(
        "Product",
        "ProductName",
        "String"
    );

    someTable.addColumn("ID", "String");
    someTable.addColumn("UnitType", "String");
    someTable.addColumn("Units", "Decimal");
    someTable.addColumn("CostPerUnit", "Decimal");
*/

/*
    TableInnerClass.Column[] selCols = someTable.getCols("ID", "DOB");
    //    TableInnerClass.Column[] selCols = someTable.getCols();


    if (selCols != null)  {
      final String dashes = "--------------------------------------";
      final String colNameHdr = "Column Name";
      final String colTypeHdr = "Column Type";
      final String spaces = dashes.replace('-', ' ');
      String colName = null;
      String colType = null;

      System.out.println("Table: " + someTable.getName());

      // Print the Headers at either ends of the line
      System.out.println(dashes);
      System.out.println(
          colNameHdr
          + spaces.substring(colNameHdr.length(), spaces.length() - colTypeHdr.length() - 1)
          + colTypeHdr);
      System.out.println(dashes);

      // Print the column name and type at either end of each line
      for (int i = 0; selCols != null && i < selCols.length; i++) {
        colName = selCols[i].getName();
        colType = selCols[i].getType();
        System.out.println(
            colName
            + spaces.substring(colName.length(), spaces.length() - colType.length() - 1)
            + colType);
      }
    }
  }
*/

    // An anonymouse class saying hello;
/*
    new Object() {
      public void hello() {
        System.out.println("hello");
      }
    }.hello();
*/
    // RosterTest
    // RosterTest.main();
  }
}
