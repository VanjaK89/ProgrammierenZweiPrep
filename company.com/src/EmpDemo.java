public class EmpDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", 1, "Software", 2990.56);
        Employee e2 = new Employee("John", 2, "Design", 3990.56);
        Employee e3 = new Employee("John", 3, "Software", 4990.56);
        Employee e4 = new Employee("John", 4, "Software", 5990.56);

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(e1);
        employeeManager.addEmployee(e2);
        employeeManager.addEmployee(e3);
        employeeManager.addEmployee(e4);

        System.out.println(employeeManager.findByEmpNumber(2));
        System.out.println(employeeManager.findByDepartment("Software"));
        System.out.println(employeeManager.findByMaxSalary());
    }
}
