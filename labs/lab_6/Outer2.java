package lab_6;

public class Outer2 {
    public void display() {
        System.out.println("Display outer class 2");
    }

    public void displayInner(){
        Inner2 inner2 = new Inner2();
        inner2.display2();
    }

    public class Inner2 {
        public void display2() {
            System.out.println("Display inner class 2");
        }
    }
}
