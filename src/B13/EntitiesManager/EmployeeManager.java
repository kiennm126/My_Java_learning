package B13.EntitiesManager;

import B13.Entities.Employee;
import B13.Entities.Experience;
import B13.Entities.Fresher;
import B13.Entities.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {

    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void insert(Employee employee) {
        this.employees.add(employee);
    }

    public Employee findById(String employeeID) {
        return this.employees.stream()
                             .filter(employee -> employee.getEmployeeID()
                             .equals(employeeID))
                             .findFirst()
                             .orElse(null);
    }

    public boolean deleteById(String employeeID) {
        Employee employee = this.findById(employeeID);
        if (employee == null) {
            return false;
        }
        this.employees.remove(employee);
        return true;
    }

    public List<Employee> findByType(int type) {
        return this.employees.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof Experience;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employees;
    }

    public long countEmployees() {
        return employees.size();
    }
}