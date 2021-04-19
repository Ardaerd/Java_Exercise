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


}
