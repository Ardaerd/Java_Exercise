package Inheritance_and_Interface.University;

public class Student {

    private String name;
    private String studentNo;
    private String homeland;
    private String department;
    private int enteringYear;
    private int currentYear;
    private University university;

    public Student(String name, String studentNo, String homeland, String department, int enteringYear, University university) {
        this.name = name;
        this.studentNo = studentNo;
        this.homeland = homeland;
        this.department = department;
        this.enteringYear = enteringYear;
        this.currentYear = 2021;
        this.university = university;
        university.addStudent(this);
    }

    public String toString() {
        return "------------ " + university.getNameOfUniversity() + " -------------\n" +
                "Name of Student: " + name + "\n" +
                "Student Number: " + studentNo + "\n" +
                "Homeland: " + homeland + "\n" +
                "Department: " + department + "\n" +
                "The year of studied: " + (currentYear-enteringYear) + "\n" +
                "-----------------------------------";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void setHomeland(String homeland) {
        this.homeland = homeland;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEnteringYear(int enteringYear) {
        this.enteringYear = enteringYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getHomeland() {
        return homeland;
    }

    public String getDepartment() {
        return department;
    }

    public int getEnteringYear() {
        return enteringYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public University getUniversity() {
        return university;
    }
}
