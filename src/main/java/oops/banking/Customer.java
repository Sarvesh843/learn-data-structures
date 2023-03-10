package oops.banking;

public class Customer extends Person{
    private int accountNumber;

    private String occupation;

    private static int countAccount = 0;

    public Customer(String name, int age) {
        super(name, age);
        this.accountNumber = (++countAccount);
        this.occupation = "";
    }

    public Customer(int accountNumber,
                    String name,
                    int age,
                    String occupation) {
        super(name, age);
        this.accountNumber = accountNumber;
        this.occupation = occupation;
        countAccount++;
    }

    public Customer(int accountNumber, String name, int age) {
        super(name, age);
        this.accountNumber = accountNumber;
        this.occupation = "";
        countAccount++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static int getCountAccount() {
        return countAccount;
    }

    @Override
    public String getName(){
        return "Customer:"+ super.getName();
    }

}
