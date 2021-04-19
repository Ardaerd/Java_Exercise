package Class.Company;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Apple");

        Employee employee_1 = new Employee("John",100);
        Employee employee_2 = new Employee("Steve",300);
        Employee employee_3 = new Employee("Arda",200000);
        Employee employee_4 = new Employee("Ekin",200000);

        Department HR = new Department("Human Resources",new Employee("Jane",1000));
        Department AI = new Department("AI Team Leaders", new Employee("Ekin",1000));
        Department IoT = new Department("Internet Of Things", new Employee("Arda",1000));

        company.addDepartment(HR);
        company.addDepartment(AI);
        company.addDepartment(IoT);

        HR.addStaff(employee_1);
        HR.addStaff(employee_2);
        AI.addStaff(employee_3);
        IoT.addStaff(employee_4);

        System.out.println(company);
    }
}
