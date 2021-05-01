package Inheritance_and_Interface.Contacts;

import Inheritance_and_Interface.University.Student;

public interface EditStudents {
    public boolean saveStudent(Students student);
    public boolean removeStudent(Students student);
    public void displayStudent(Students student);
    public void listStudent();
}
