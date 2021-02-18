package lab_3;

import java.util.ArrayList;

public class Classroom {
    private int ID;
    private String name;

    private ArrayList<Student> students = new ArrayList<>();

    public Classroom(int id, String name) {
        this.ID = id;
        this.name = name;
    }

    public void addStudent(Student student) {
        System.out.println("Student " + student.getName() + " has been added to class " + this.name);
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
