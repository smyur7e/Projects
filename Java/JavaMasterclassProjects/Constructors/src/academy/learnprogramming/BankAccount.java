package academy.learnprogramming;

import java.util.Calendar;

public class BankAccount {

  private String number;
  private float balance;
  private String customerName;
  private String email;
  private String phone;

//  public BankAccount() {
//    System.out.println("Default Constructor Called");
//  }

  public BankAccount(String customerName, String email, String phone) {
    this.customerName = customerName;
    this.email = email;
    this.phone = phone;
    this.balance = 0.0f;
    this.number = this.email + this.phone + "001";
  }

  public BankAccount(float balance, String customerName, String email, String phone) {
    this(customerName, email, phone);
    this.balance = balance;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void deposit(float creditAmount) {
    if (creditAmount > 0) {
      this.balance += creditAmount;
    } else {
      System.out.println("Credit amount must be >= 0");
    }
  }

  public void withdraw(float debitAmount) {
    if (debitAmount < 0) {
      System.out.println("Debit amount must be >= 0");
    } else if (this.balance < debitAmount) {
      System.out.println("Insuffcient Funds");
    } else {
      this.balance -= debitAmount;
    }
  }
}
