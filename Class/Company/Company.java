package Class.Company;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addStaff(Employee employee, Department department) {
        department.addStaff(employee);
    }

    public String toString() {
        return "Company: " + name + "\n";
    }

}
