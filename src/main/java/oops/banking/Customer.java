package oops.banking;

public class Customer {
    private int accountNumber;
    private String name;
    private int age;
    private String occupation;

    private static int countAccount = 0;

    public Customer(String name, int age) {
        this.accountNumber = (++countAccount);
        this.name = name;
        this.age = age;
        this.occupation = "";
    }

    public Customer(int accountNumber,
                    String name,
                    int age,
                    String occupation) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        countAccount++;
    }

    public Customer(int accountNumber, String name, int age) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.occupation = "";
        countAccount++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static int getCountAccount() {
        return countAccount;
    }
}
