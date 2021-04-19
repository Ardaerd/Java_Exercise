package Class.Company;

import java.util.ArrayList;

public class Department {
    private String name;
    private Employee supervisor;
    private ArrayList<Employee> staff;

    public Department(String name, Employee supervisor) {
        this.name = name;
        staff = new ArrayList<Employee>();
        this.supervisor = supervisor;
        supervisor.setSupervisor(true);
    }

    public void addStaff(Employee employee) {
        staff.add(employee);
        employee.setDepartment(this);
    }
}
