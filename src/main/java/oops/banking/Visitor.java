package oops.banking;

public class Visitor  extends  Person{
    private String reason;

    public Visitor(String name, int age, String reason) {
        super(name, age);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
