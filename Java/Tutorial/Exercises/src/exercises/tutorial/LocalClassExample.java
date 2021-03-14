package exercises.tutorial;

public class LocalClassExample {

  private static String nonDigitRegEx = "[^0-9]";

  public static void validatePhoneNumber(String phone1, String phone2) {
    int numberLength = 10;

    class PhoneNumber {
      private String validPhoneNumber = null;

      PhoneNumber(String phoneNo) {
        String digitsOnlyPhoneNo =
            phoneNo.replaceAll(LocalClassExample.nonDigitRegEx, "");

        if (digitsOnlyPhoneNo.length() == numberLength)
          this.validPhoneNumber = digitsOnlyPhoneNo;
        else
          this.validPhoneNumber = null;
      }

      public String getValidPhoneNumber() {
        return this.validPhoneNumber;
      }

      public void printOriginalPhoneNos() {
        System.out.println("Original PHone Numbers are "
          + phone1 + ", "
          + phone2);
      }
    }

    PhoneNumber p1 = new PhoneNumber(phone1);
    PhoneNumber p2 = new PhoneNumber(phone2);
    p1.printOriginalPhoneNos();

    if (p1.getValidPhoneNumber() == null) {
      System.out.println("PHone Number " + phone1 + " is invalid");
    } else {
      System.out.println("Phone Nubmer " + phone1 + " is valid");
    }

    if (p2.getValidPhoneNumber() == null) {
      System.out.println("PHone Number " + phone2 + " is invalid");
    } else {
      System.out.println("Phone Nubmer " + phone2 + " is valid");
    }
  }
}
