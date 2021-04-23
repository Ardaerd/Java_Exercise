package Inheritance_and_Interface.University;

public class Graduated {

    private String name;
    private String department;
    private String job;
    private String homeland;
    private int age;
    private University university;

    public Graduated(String name, String department, String job, String homeland, int age, University university) {
        this.name = name;
        this.department = department;
        this.job = job;
        this.homeland = homeland;
        this.age = age;
        this.university = university;
        university.addGraduates(this);
    }

    public String toString() {
        return "------------ " + university.getNameOfUniversity() + " -------------\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Homeland: " + homeland + "\n" +
                "Department: " + department + "\n" +
                "Job: " + job + "\n" +
                "-----------------------------------";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }
}
