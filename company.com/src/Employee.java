public class Employee {

    private String name;
    private int empNumber;
    private String department;
    private double salary;

    public Employee(String name, int empNumber, String department, double salary) {
        this.name = name;
        this.empNumber = empNumber;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empNumber=" + empNumber +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
