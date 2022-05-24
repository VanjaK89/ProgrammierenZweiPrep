import java.util.ArrayList;

public class EmployeeManager {

    ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeManager() {
        this.employees = employees;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {

        for (Employee e : employees) {
            if (number == e.getEmpNumber()) {
                return e;
            }
        }
        return null;
    }
    ArrayList<Employee> findByDepartment(String department){
        ArrayList<Employee> empList = new ArrayList<>();
        for (Employee e:employees) {
            if(e.getDepartment().equals(department)){
                empList.add(e);
            }
        }
        return empList;
    }

    Employee findByMaxSalary(){
        Employee highestE = null;
        double highestSalary = -1;
        for(Employee e: employees){
            if(e.getSalary() > highestSalary){
                highestSalary = e.getSalary();
                highestE = e;
            }
        }
        return highestE;
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "employees=" + employees +
                '}';
    }
}