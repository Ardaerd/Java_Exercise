package Class.Company;

public class Employee {
    private String name;
    private double salary;
    private Department department;
    private boolean supervisor;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        supervisor = false;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Salary: " + salary + "\n";
    }
}
