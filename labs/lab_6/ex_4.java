package lab_6;

import lab_6.Outer2.Inner2;

public class ex_4 {
    public static void main(String[] args) {
        /*
         * 6.4 Create an outer class with a function display, again create another class
         * inside the outer class named inner with a function called display and call
         * the two functions in the main class. x
         */
        System.out.println("Static inner class");
        Outer outer = new Outer();
        outer.display();
        Outer.Inner inner = new Outer.Inner();
        inner.display();

        System.out.println("\nInner class");
        Outer2 outer2 = new Outer2();
        outer2.display();
        outer2.displayInner();
    }
}
