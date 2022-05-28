package EmployeeUB04;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new FixComissionEmployee("Maxi", "Max", "Software", 2908.01, 200);
        Employee e2 = new FixComissionEmployee("Susic", "Susi", "Design", 1988.01, 100);
        Employee e3 = new PercentComissionEmployee("Mayer", "Hans", "Software", 2789.01, 200);

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(e1);
        employeeManager.addEmployee(e2);
        employeeManager.addEmployee(e3);
        System.out.println(employeeManager);
        System.out.println(employeeManager.calcTotalSalary());
        System.out.println(employeeManager.getSalaryByDepartment());

    }
}
