package oops.banking;

public class Employee extends Person{
    private int employeeId;
    private int departmentId;
    private String designation;

    public Employee(String name, int age, int employeeId, int departmentId, String designation) {
        super(name, age);
        this.employeeId = employeeId;
        this.departmentId = departmentId;
        this.designation = designation;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDesignation() {
        return designation;
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
