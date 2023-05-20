import java.io.*;

class PropertyCalculator {

  public static void main(String[] args) {

    // Present choices for AU states
    System.out.println("In which state is the property?");
    String[] states = new String[7];
    int stateChoice = -1;
    for (int i = 0; i < 7; i++) {

      switch (i) {
        case 0: states[i] = "ACT"; break;
        case 1: states[i] = "NSW"; break;
        case 2: states[i] = "NT"; break;
        case 3: states[i] = "QLD"; break;
        case 4: states[i] = "SA"; break;
        case 5: states[i] = "TAS"; break;
        case 6: states[i] = "VIC"; break;
      }
      System.out.println("  " + (i + 1) + ". " + states[i]);  
    }

    /* // "System.in.read()" returns a char value. So,
       // subtract it from the char value of '0' to convert
       // it to a number. Then subtract 1 to get the index
       // value corresponding the state chosen by the user.
    */
    try {
      while
        ((stateChoice = (System.in.readline() - '0') - 1) < 0 ||
          stateChoice > 6) {
        System.out.println("Invalid Choice! Try Again");
      }
    }
    catch (IOException rex) {
      System.out.println("Error Reading Choice :(!");
    }

    System.out.println("You chose " + states[stateChoice]);

/*
    System.out.println("What is the property Value?");
    int[][] ranges = new int[7][2];
    for (int i = 0; i < 7; i++) {
      switch(i) {
        case 0:
          ranges[i][0] = 0;
          ranges[i][1] = 499_999;
          break;
        case 1:
          ranges[i][0] = 500_000;
          ranges[i][1] = 599_999;
          break; 
        case 2:
          ranges[i][0] = 600_000;
          ranges[i][1] = 699_999;
          break;
        case 3:
          ranges[i][0] = 700_000;
          ranges[i][1] = 799_999;
          break;
        case 4:
          ranges[i][0] = 800_000;
          ranges[i][1] = 899_999;
          break;
        case 5:
          ranges[i][0] = 900_000;
          ranges[i][1] = 999_999;
          break;
        case 6:
          ranges[i][0] = 1_000_000;
          ranges[i][1] = 1_099_999;
          break;
      }
    }

    System.out.println("  1. $499,999 or less");
    System.out.println("  2. $500,000 to 599,999");
    System.out.println("  3. $600,000 to 699,999");
    System.out.println("  4. $700,000 to 799,999");
    System.out.println("  5. $800,000 to 899,999");
    System.out.println("  6. $900,000 to 999,999");
    System.out.println("  7. $1,000,000 to 1,099,999");
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