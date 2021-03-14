package academy.learnprogramming;

public class VIPCustomer {
  private String name;
  private String emailAddress;
  private double creditLimit;

  public VIPCustomer(String name, String emailAddress, double creditLimit) {
    this.name = name;
    this.emailAddress = emailAddress;
    this.creditLimit = creditLimit;
  }

  public VIPCustomer() {
    this("Sridhar", "smyur7e@icloud.com", 1000000.00d);
  }

  public VIPCustomer(String name, String emailAddress) {
    this(name, emailAddress, 1000000.00d);
  }

  public String getName() {
    return name;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public double getCreditLimit() {
    return creditLimit;
  }
}
