package Inheritance_and_Interface.Contacts;

import Inheritance_and_Interface.University.Student;

import java.util.ArrayList;

public class StudentsImp implements EditStudents{
    private ArrayList<Students> students = new ArrayList<Students>();

    public boolean saveStudent(Students student) {
        if (students.contains(student)) {
            System.out.println(student.getName() + " is already added.");
            return false;
        } else {
            boolean checkStudent = students.add(student);

            if (checkStudent) {
                System.out.println(student.getName() + " is added.");
            } else {
                System.out.println(student.getName() + " is invalid student");
            }
            return checkStudent;
        }
    }

    public boolean removeStudent(Students student) {
        if (students.contains(student)) {
            System.out.println(student.getName() + " is removed.");
            return students.remove(student);
        } else {
            System.out.println(student.getName() + " doesn't exist.");
            return false;
        }
    }

    public void displayStudent(Students students) {
        System.out.println(students);
    }

    public void listStudent() {
        for (Students std : students) {
            System.out.println(std);
        }
    }
}
