public class Main {
  public static void main(String[] args) {
    String classTested = "Calculator";
    String methodTested = "";

    if (classTested == "") {
      switch (methodTested) {
        case "printMegaBytesAndKiloBytes":
          MegaBytesConverter.testPrintMegaBytesAndKiloBytes();
          break;
        case "shouldWakeUp":
          BarkingDog.testShouldWakeUp();
          break;
        case "isLeapYear":
          LeapYear.testIsLeapYear();
          break;
        case "areEqualByThreeDecimalPlaces":
          DecimalComparator.testAreEqualByThreeDecimalPlaces();
          break;
        case "hasEqualSum":
          EqualSumChecker.testHasEqualSum();
          break;
        case "hasTeen":
          TeenNumberChecker.testHasTeen();
          break;
        case "area":
          AreaCalculator.testArea();
          break;
        case "printYearsAndDays":
          MinutesToYearsDaysCalculator.testPrintYearsAndDays();
          break;
        case "printEqual":
          IntEqualityPrinter.testPrintEqual();
          break;
        case "isCatPlaying":
          PlayingCat.testIsCatPlaying();
          break;
        case "printNumberInWord":
          NumberInWord.testPrintNumberInWord();
          break;
        case "getDaysInMonth":
          NumberOfDaysInMonth.testGetDaysInMonth();
          break;
        case "sumOdd":
          SumOddRange.testSumOdd();
          break;
        case "isPalindrome":
          NumberPalindrome.testIsPalindrome();
          break;
        case "sumFirstAndLastDigit":
          FirstLastDigitSum.testSumFirstAndLastDigit();
          break;
        case "getEvenDigitSum":
          EvenDigitSum.testGetEvenDigitSum();
          break;
        case "hasSharedDigit":
          SharedDigit.testHasSharedDigit();
          break;
        case "hasSameLastDigit":
          LastDigitChecker.testHasSameLastDigit();
          break;
        case "getGreatestCommonDivisor":
          GreatestCommonDivisor.testGetGreatestCommonDivisor();
          break;
        case "printFactors":
          FactorPrinter.testPrintFactors();
          break;
        case "isPerfect":
          PerfectNumber.testIsPerfectNumber();
          break;
        case "numberToWords":
          NumberToWords.testNumberToWords();
          break;
        case "testCanPack":
          FlourPacker.testCanPack();
          break;
        case "testInputCalculator":
          InputCalculator.inputThenPrintSumAndAverage();
          break;
        case "testGetBucketCount":
          TestPaintJob.testGetBucketCount();
          break;
        default:
          System.out.println("Unknown Method");
      }
    } else {
      switch (classTested) {
        case "SimpleCalculator":
          SimpleCalculator.test();
          break;
        case "Wall":
          Wall.test();
          break;
        case "Calculator":
          Calculator.test();
          break;
        default:
          System.out.println("Unknown Class");
      }
    }


  }
}