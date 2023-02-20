package assignments.oops;

public class VipCustomer{
    public double creditLimit;
    public String name;
    public String email;

    public VipCustomer(){
        this("XYZ",10.0,"xyz@abc.com");
    }

    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"xyz@abc.com");
    }

    VipCustomer(String _name,double _creditLimit,String _email){
        email=_email;
        name=_name;
        creditLimit=_creditLimit;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public double getCreditLimit(){
        return this.creditLimit;
    }
}
