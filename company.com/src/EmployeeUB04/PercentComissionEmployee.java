package EmployeeUB04;

public class PercentComissionEmployee extends Employee{

    protected double percentComission;

    public PercentComissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentComission) {
        super(lastname, firstname, department, baseSalary);
        this.percentComission = percentComission;
    }
    public double getFullSalary(){
        baseSalary = percentComission + baseSalary;
        return baseSalary;
    }

    @Override
    public String toString() {
        return "PercentComissionEmployee{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                ", percentComission=" + percentComission +
                '}';
    }
}
