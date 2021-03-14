public class SimpleCalculator {

  private double firstNumber;
  private double secondNumber;

  public double getFirstNumber() {
    return firstNumber;
  }

  public double getSecondNumber() {
    return secondNumber;
  }

  public void setFirstNumber(double firstNumber) {
    this.firstNumber = firstNumber;
  }

  public void setSecondNumber(double secondNumber) {
    this.secondNumber = secondNumber;
  }

  public double getAdditionResult() {
    return firstNumber + secondNumber;
  }

  public double getSubtractionResult() {
    return firstNumber - secondNumber;
  }

  public double getMultiplicationResult() {
    return firstNumber * secondNumber;
  }

  public double getDivisionResult() {
    return (secondNumber == 0)? 0 : firstNumber / secondNumber;
  }

  public static void test() {
    SimpleCalculator calculator = new SimpleCalculator();
    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(9);
    System.out.println("Calculator.add = " + calculator.getAdditionResult());
    System.out.println("Calculator.subtract = " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("Calculator.multiply = " + calculator.getMultiplicationResult());
    System.out.println("Calculator.divide = " + calculator.getDivisionResult());
  }
}
