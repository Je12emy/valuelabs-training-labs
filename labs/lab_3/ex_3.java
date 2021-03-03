package lab_3;

public class ex_3 {
    public static void main(String[] args) {
       /*
       3.3 Write a program for the following
            1. Example for call by value. x
            2. Example for call by reference. x
        3.4 Write a program to give the example for ‘this’ operator. And also use the ‘this’ keyword as return statement. x
        */


        Student student1 = new Student(1, "Jeremy", 22);
        Student  student2 = new Student(2, "Jonathan", 24);
        Student student3 = new Student(3, "Joseph", 21);

        Classroom classA = new Classroom(1, "A-9-7");

        classA.addStudent(student1);
        classA.addStudent(student2);
        classA.addStudent(student3);

        // Here values are altered by memory address since the student1 object shares the same memory address
        student1.setAge(21);
        System.out.println("The age of " + classA.getStudents().get(0).getName() + " has also been updated to " + classA.getStudents().get(0).getAge() + " in the classroom list");
        // Here, we are asigning a student count
        int studentCount = classA.getStudents().size();
        // If this count is increased, it will not affect the original object since it is by value.
        studentCount++;
        System.out.println("There are " + classA.getStudents().size() + " students in class " + classA.getName() + " there are supped to be " + studentCount + " students.");

    }
}
