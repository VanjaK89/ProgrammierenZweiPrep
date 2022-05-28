package EmployeeUB04;

public class FixComissionEmployee extends Employee{

    protected double additionalComission;

    public FixComissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalComission) {
        super(lastname, firstname, department, baseSalary);
        this.additionalComission = additionalComission;

    }
    public double getFullSalary(){
        baseSalary= additionalComission + baseSalary;
        return baseSalary;
    }

    @Override
    public String toString() {
        return "FixComissionEmployee{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                ", additionalComission=" + additionalComission +
                '}';
    }
}
