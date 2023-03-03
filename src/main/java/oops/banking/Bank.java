package oops.banking;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Welcome to Children bank of India!");

        Customer c1 = new Customer(
                1,
                "Ashwath",
                23,
                "student");

        Customer c2 = new Customer(
                2,
                "Kunal",
                22,
                "student");

        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}
