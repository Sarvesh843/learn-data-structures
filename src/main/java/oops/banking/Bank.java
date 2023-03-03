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

        Customer c3 = new Customer(
                3,
                "Punit",
                22
        );

        System.out.println(c1.getName());
        System.out.println(c1.getOccupation());

        System.out.println(c2.getName());
        System.out.println(c3.getName());
    }
}
