package EmployeeUB04;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    protected ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeManager() {
        this.employees = employees;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public double calcTotalSalary(){
        double summe = 0;
        for(Employee e: employees){
            summe += e.getFullSalary();
        }
        return summe;
    }
    public HashMap<String, Double>getSalaryByDepartment(){
        HashMap<String, Double> w = new HashMap<String, Double>();
        for(Employee e: employees){
            if(w.containsKey(e.department)){
                double help = w.get(e.department);
                w.put(e.department, help + e.getFullSalary());
            }
            else{
                w.put(e.department, e.getFullSalary());
            }

        }
        return w;
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "employees=" + employees +
                '}';
    }
}
