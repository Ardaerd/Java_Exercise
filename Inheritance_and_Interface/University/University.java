package Inheritance_and_Interface.University;

import java.util.ArrayList;

public class University {

    private String nameOfUniversity;
    private String rector;
    private ArrayList<Employee> employees;
    private ArrayList<Student> students;
    private ArrayList<Graduate> graduates;

    public University(String nameOfUniversity, String rector) {
        this.nameOfUniversity = nameOfUniversity;
        this.rector = rector;
        employees = new ArrayList<Employee>();
        students = new ArrayList<Student>();
        graduates = new ArrayList<Graduate>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listOfStudent() {
        System.out.println("------------ List of Student ------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i+1 + "- " + students.get(i).getName() + " (" + students.get(i).getStudentNo() + ")");
        }
        System.out.println("---------------------------------------");
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listOfEmployee() {
        System.out.println("------------ List of Employee ------------");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(i+1 + "- " + employees.get(i).getNameOfEmployee());
        }
        System.out.println("---------------------------------------");
    }

    public String toString() {
        return "Welcome to " + nameOfUniversity + "\n" +
                "Total Number of Employees: " + employees.size() + "\n" +
                "Total Number of Students: " + students.size();
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setGraduates(ArrayList<Graduate> graduates) {
        this.graduates = graduates;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public String getRector() {
        return rector;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Graduate> getGraduates() {
        return graduates;
    }
}
