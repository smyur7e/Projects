package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount(
            "James Bond"
            , "james.bond@mi6.gov.uk"
            , "+44-007-007-007");
//        savingsAccount.setCustomerName("James Bond");
//        savingsAccount.setNumber("MI6007");
//        savingsAccount.setEmail("james.bond@mi6.gov.uk");
//        savingsAccount.setPhone("+44-007-007-007");
      VIPCustomer me = new VIPCustomer();
      VIPCustomer preeti =
          new VIPCustomer("Preeti",
            "preeti.shivram@gmail.com");
      System.out.println("Name: " + me.getName()
        + ", Email: " + me.getEmailAddress()
        + ", Credit Limit: $" + me.getCreditLimit());
      System.out.println("Name: " + preeti.getName()
        + ", Email: " + preeti.getEmailAddress()
        + ", Credit Limit: $" + preeti.getCreditLimit());

        savingsAccount.deposit(-1000);
        savingsAccount.deposit(1000);

        System.out.println(
            "Account No " + savingsAccount.getNumber()
            + " Balance = " + savingsAccount.getBalance());

        savingsAccount.withdraw(-100);
        savingsAccount.withdraw(100);
        System.out.println(
            "Account No " + savingsAccount.getNumber()
            + " Balance = " + savingsAccount.getBalance());
    }
}
