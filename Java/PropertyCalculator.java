import java.io.*;

class PropertyCalculator {

  public static void main(String[] args) {

    // Storing the separator for a NEWLINE for
    // input/output help skipping reading them
    // when the user enters their SINGLE char
    // choice AFTER a 'System.out.println()'
    // in a platform agnositc way.
    String NEWLINE = System.lineSeparator();

    String[] state = new String[7];
    int stateChoice = -1;

    int[][] propertyPriceRange = new int[7][2];

    for (int i =0; i < 2; i++) {

      // Menu Presentation Switch
      switch(i) {

        case 0: // AU State Menu
     
          System.out.println("In which state is the property?");

          for (int j = 0; j < 4; j++) {
             switch (j) {
               case 0: state[j] = "ACT"; break;
               case 1: state[j] = "NSW"; break;
               case 2: state[j] = "VIC"; break;
               case 3: state[j] = "QLD"; break;
               // case 4: state[j] = "SA"; break;
               // case 5: state[j] = "TAS"; break;
               // case 6: state[j] = "NT"; break;
             }

             System.out.println("  " + (j + 1) + ". " + state[j]);  

          }

          try {
 
            // "System.in.read()" returns a int value of the char enterd\ed
            // or -1. To get the menu item option entered subtract it from
            // the char value of '0' to convert it to a number. Then
            // subtract 1 to get the index value corresponding the state
            // chosen by the user.

            while ((stateChoice = (System.in.read() - '0') - 1) < 0
                    || stateChoice > 6) {

              System.out.println("Invalid Choice! Try Again");
              // do not read the NEWLINE inserted by 'System.out.println()'
              System.in.skip(NEWLINE.length());

            }
          }
          catch (IOException rex) {
              System.out.println("Error Reading Choice :(!");
          }

          System.out.println("You chose " + state[stateChoice]);
            break;

        case 1: // Property Price Range Menu

          System.out.println("What is the property Value?");

          for (int j = 0; j < 7; j++) {
            switch(j) {
              case 0: propertyPriceRange[j][0] = 0;
                      propertyPriceRange[j][1] = 499_999;
                      break;

              case 1: propertyPriceRange[j][0] = 500_000;
                      propertyPriceRange[j][1] = 599_999;
                      break;

              case 2: propertyPriceRange[j][0] = 600_000;
                      propertyPriceRange[j][1] = 699_999;
                      break;

              case 3: propertyPriceRange[j][0] = 700_000;
                      propertyPriceRange[j][1] = 799_999;
                      break;

              case 4: propertyPriceRange[j][0] = 800_000;
                      propertyPriceRange[j][1] = 899_999;
                      break;

              case 5: propertyPriceRange[j][0] = 900_000;
                      propertyPriceRange[j][1] = 999_999;
                      break;

              case 6: propertyPriceRange[j][0] = 1_000_000;
                      propertyPriceRange[j][1] = 1_099_999;
                      break;
            }

            // Present amounts in each range 1000's separators
            String propertyPriceRangeText = "  " + (j + 1) + ".";

            for (int k = 0; k < 2; k++) {

               int remainder = propertyPriceRange[j][k];
               int quotient = 0;

               switch (k) {
                 case 0: propertyPriceRangeText += " From ";
                         break;
                 case 1: propertyPriceRangeText += " To ";
                         break;
               }

               if (remainder > 1000000) {
                  quotient = remainder / 1000000;
                  propertyPriceRangeText += quotient + ",";
                  remainder %= 1000000;
               }

               if (remainder > 1000) {
                  quotient = remainder / 1000;

                  if (quotient >= 100)
                    propertyPriceRangeText += quotient + ",";
                  else if (quotient >= 10)
                    propertyPriceRangeText += "0" + quotient + ",";
                  else
                    propertyPriceRangeText += "00" + quotient + ",";

                  remainder %= 1000;
               } else if (quotient > 0)
                 propertyPriceRangeText += "000,";

               if (remainder >= 100)
                  propertyPriceRangeText += remainder;
               else if (remainder >= 10)
                  propertyPriceRangeText += "0" + remainder;
               else if (quotient > 0 || remainder > 0)
                  propertyPriceRangeText += "00" + remainder;
               else
                  propertyPriceRangeText += "0";
            }

            System.out.println(propertyPriceRangeText);
          }

          break;
      }      
    }

/*
    System.out.print("Enter your choice: " );
    int rangeIdx = System.in.read() - 1;    

    float get = 0.1f;
    float[] stampDutyRange = new float[2];
    for (int i = 0; i < 2; i++) {
      switch (state) {
        case 1:
          stampDutyRange[i] =
            ranges[rangeIdx] * (1 + gst) * 0.02465;
          break;
        case 2:
          if (ranges[rangeIdx] < 15001)
            stampDurtyRange[i] =
              ranges[rangeIdx] * 0.0125;
          else if (ranges[rangeIdx] < 32001)
            stampDutyRange[i] =
              187 + (ranges[rangeIdx] - 15000) * 0.015;
          else if (ranges[rangeIdx] < 87001)
            stampDutyRange[i] =
              442 + (ranges[rangeIdx] - 15000) * 0.0175;
          else if (ranges[rangeIdx] < 327001)
            stampDutyRange[i] =
              1405 + (ranges[rangeIdx] - 15000) * 0.035;
          else if (ranges[rangeIdx] < 1089001)
            stampDutyRange[i] =
              9805 + (ranges[rangeIdx] - 15000) * 0.045;
          else
            stampDutyRange[i] =
              44095 + (ranges[rangeIdx] - 15000) * 0.055;
          break;
        default: 
      }
    }
*/
  }
}