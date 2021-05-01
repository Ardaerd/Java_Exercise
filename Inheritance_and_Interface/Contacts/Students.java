package Inheritance_and_Interface.Contacts;

import java.util.ArrayList;

public class Students extends Person {
    private String studentNo;
    private String department;
    private ArrayList<String> lectures;

    public Students() {
        // TODO Auto-generated constructor stub
    }

    public Students(String name, String phoneNumber, int yearOfBirth, Address address, String studentNo, String department) {
        super(name, phoneNumber, yearOfBirth, address);
        this.department = department;
        this.studentNo = studentNo;
        lectures = new ArrayList<String>();
    }

    public void addLecture(String lecture) {
        lectures.add(lecture);
    }

    public String toString() {
        return "------------ " + super.getName() + " ------------\n" +
                "Student Number: " + studentNo + "\n" +
                "Student's Department: " + department + "\n" +
                "Lectures: " + lectures + "\n" +
                "Year of Birth: " + super.getYearOfBirth() + "\n" +
                "Address: " + super.getAddress().toString() + "]";
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLectures(ArrayList<String> lectures) {
        this.lectures = lectures;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getDepartment() {
        return department;
    }

    public ArrayList<String> getLectures() {
        return lectures;
    }
}
