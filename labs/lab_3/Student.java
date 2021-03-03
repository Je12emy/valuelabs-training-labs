package lab_3;
public class Student {
    private int ID;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.ID = id;
        this.name = name;
        this.age = age;

        studentCreated();
    }

    private void studentCreated(){
        System.out.println("Student " + this.name + " has ben registered");
    }

    public int getAge() {
        System.out.println("The age of "+ this.name + " has been modified to " + this.age);
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
