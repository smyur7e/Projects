package exercises.tutorial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

  public enum Sex {
    MALE, FEMALE
  }

  String name;
  LocalDate birthday;
  Sex gender;
  String emailAddress;

  public Sex getGender() {
    return gender;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public int getAge() {
    LocalDate today = LocalDate.now();
    int age = 0;

    if (today.getYear() > birthday.getYear()) {
      age = today.getYear() - birthday.getYear();

      if (today.getMonthValue() > birthday.getMonthValue())
        ; // Month is past birth month
      else if (today.getMonthValue() == birthday.getMonthValue() &&
        today.getDayOfMonth() >= birthday.getDayOfMonth())
        ; // Month is the same as the birth month but day is past the birth day
      else
        --age; // neither the birth month nor the birth day of the birth month
    }

    return age;
  }

  public void printPerson() {
    System.out.println("Name: " + name
        + ", Sex: " + gender.toString()
        + ", Age: " + getAge()
        + ", Email: " + emailAddress);
  }

  private Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
    this.name = name;
    this.birthday = birthday;
    this.gender = gender;
    this.emailAddress = emailAddress;
  }

  public static List<Person> createRoster() {
    List<Person> r = new ArrayList<Person>();

    r.add(
        new Person(
            "Sridhar"
            , LocalDate.of(1970, 1, 1)
            ,Sex.MALE
            , "smyur7e@icloud.com"));

    r.add(
        new Person(
            "Preeti"
            , LocalDate.of(1974, 1, 1)
            ,Sex.FEMALE
            , "preetishivram@gamil.com"));

    r.add(
        new Person(
            "Srinivasan"
            , LocalDate.of(1936, 1, 1)
            ,Sex.MALE
            , "masruks36@gmail.com"));

    r.add(
        new Person(
            "Shivram IYer"
            , LocalDate.of(1941, 1, 1)
            ,Sex.MALE
            , "shivram555@gmail.com"));

    r.add(
        new Person(
            "Sita Shivram Iyer"
            , LocalDate.of(1948, 1, 1)
            ,Sex.FEMALE
            , "sita.shivram@gmail.com"));

    r.add(
        new Person(
            "Rukmini Srinivasan"
            , LocalDate.of(1936, 1, 1)
            ,Sex.FEMALE
            , ""));

    r.add(
        new Person(
            "Rati Shankaran"
            , LocalDate.of(1994, 1, 1)
            ,Sex.FEMALE
            , "rati.shankaran@gmail.com"));

    r.add(
        new Person(
            "Revati Venkatesh"
            , LocalDate.of(1999, 1, 1)
            ,Sex.FEMALE
            , "revathi.venkatesh@gmail.com"));

    r.add(
        new Person(
            "Raasi Venkatesh"
            , LocalDate.of(2004, 1, 1)
            ,Sex.FEMALE
            , "raasi.venkatesh@gmail.com"));

    r.add(
        new Person(
            "Mriganka Iyer"
            , LocalDate.of(2000, 1, 1)
            ,Sex.FEMALE
            , "mishti2000@gmail.com"));

    r.add(
        new Person(
            "Shankaran Kandaiah"
            , LocalDate.of(1994, 12, 1)
            ,Sex.MALE
            , "shandarn.kandaiah@gmail.com"));

    return r;
  }
}
